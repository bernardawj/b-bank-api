package com.bernardawj.bbank.process.resource;

import com.bernardawj.bbank.applicant.exception.ApplicantServiceException;
import com.bernardawj.bbank.credit.facility.dto.CloseCreditFacilityDTO;
import com.bernardawj.bbank.credit.facility.dto.CreditFacilityDTO;
import com.bernardawj.bbank.credit.facility.dto.OpenCreditFacilityDTO;
import com.bernardawj.bbank.process.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/v1/process")
public class ProcessResource {

    // Services
    private final ProcessService processService;

    @Autowired
    public ProcessResource(ProcessService processService) {
        this.processService = processService;
    }

    @PostMapping(path = "/open-credit-facility")
    public ResponseEntity<CreditFacilityDTO> openCreditFacilityForApplicant(@RequestBody @Valid OpenCreditFacilityDTO openCreditFacilityDTO) throws ApplicantServiceException {
        CreditFacilityDTO openedCreditFacilityDTO = this.processService.openCreditFacilityForApplicant(openCreditFacilityDTO);
        return new ResponseEntity<>(openedCreditFacilityDTO, HttpStatus.CREATED);
    }

    @PostMapping(path = "/close-credit-facility")
    public ResponseEntity<CreditFacilityDTO> closeCreditFacilityForApplicant(@RequestBody @Valid CloseCreditFacilityDTO closeCreditFacilityDTO) throws ApplicantServiceException {
        CreditFacilityDTO closedCreditFacilityDTO = this.processService.closeCreditFacilityForApplicant(closeCreditFacilityDTO);
        return new ResponseEntity<>(closedCreditFacilityDTO, HttpStatus.OK);
    }


}
