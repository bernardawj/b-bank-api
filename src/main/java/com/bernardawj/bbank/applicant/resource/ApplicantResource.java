package com.bernardawj.bbank.applicant.resource;

import com.bernardawj.bbank.applicant.dto.ApplicantDTO;
import com.bernardawj.bbank.applicant.exception.ApplicantServiceException;
import com.bernardawj.bbank.applicant.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/applicant")
public class ApplicantResource {

    // Services
    private final ApplicantService applicantService;

    @Autowired
    public ApplicantResource(
        ApplicantService applicantService
    ) {
        this.applicantService = applicantService;
    }

    @GetMapping(path = "/{applicantId}")
    public ResponseEntity<ApplicantDTO> getOneApplicant(@PathVariable("applicantId") Long applicantId) throws ApplicantServiceException {
        ApplicantDTO applicantDTO = this.applicantService.getApplicant(applicantId);
        return new ResponseEntity<>(applicantDTO, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<ApplicantDTO>> getAllApplicants() {
        List<ApplicantDTO> applicantDTOList = this.applicantService.getAllApplicants();
        return new ResponseEntity<>(applicantDTOList, HttpStatus.OK);
    }

}
