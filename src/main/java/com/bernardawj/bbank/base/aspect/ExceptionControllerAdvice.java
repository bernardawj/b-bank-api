package com.bernardawj.bbank.base.aspect;

import com.bernardawj.bbank.applicant.exception.ApplicantServiceException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    private static final Log LOGGER = LogFactory.getLog(ExceptionControllerAdvice.class);
    private Environment environment;

    @Autowired
    public ExceptionControllerAdvice(Environment environment) {
        this.environment = environment;
    }

    @ExceptionHandler({ ApplicantServiceException.class })
    public ResponseEntity<ErrorInfo> serviceExceptionHandler(Exception exception) {
        LOGGER.error(exception.getMessage(), exception);
        HttpStatus status = HttpStatus.BAD_REQUEST;

        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setCode(status.value());

        return new ResponseEntity<>(errorInfo, status);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorInfo> generalExceptionHandler(Exception exception) {
        LOGGER.error(exception.getMessage(), exception);
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setCode(status.value());
        errorInfo.setMessage(environment.getProperty("General.EXCEPTION_MESSAGE"));

        return new ResponseEntity<>(errorInfo, status);
    }

    @ExceptionHandler({ MethodArgumentNotValidException.class, ConstraintViolationException.class })
    public ResponseEntity<ErrorInfo> validatorExceptionHandler(Exception exception) {
        LOGGER.error(exception.getMessage(), exception);
        HttpStatus status = HttpStatus.BAD_REQUEST;

        String message;
        if (exception instanceof MethodArgumentNotValidException) {
            MethodArgumentNotValidException manvException = (MethodArgumentNotValidException) exception;
            message = manvException.getBindingResult().getAllErrors().stream().map(ObjectError::getDefaultMessage)
                          .collect(Collectors.joining(", "));
        } else {
            ConstraintViolationException cvException = (ConstraintViolationException) exception;
            message = cvException.getConstraintViolations().stream().map(ConstraintViolation::getMessage)
                          .collect(Collectors.joining(", "));
        }

        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setCode(status.value());
        errorInfo.setMessage(message);

        return new ResponseEntity<>(errorInfo, status);
    }

    private static class ErrorInfo {

        private String message;
        private Integer code;

        public ErrorInfo() {
        }

        public ErrorInfo(String message, Integer code) {
            this.message = message;
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

    }

}
