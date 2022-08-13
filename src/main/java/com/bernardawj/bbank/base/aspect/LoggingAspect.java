package com.bernardawj.bbank.base.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    private final Log LOGGER = LogFactory.getLog(this.getClass());

    @AfterThrowing(pointcut = "execution(* com.bernardawj.bbank.*.service.*Impl.java(..))", throwing = "ex")
    public void logException(Exception ex) {
        LOGGER.error(ex.getMessage());
    }

}
