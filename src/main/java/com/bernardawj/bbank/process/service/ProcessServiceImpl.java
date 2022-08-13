package com.bernardawj.bbank.process.service;

import com.bernardawj.bbank.applicant.domain.Applicant;
import com.bernardawj.bbank.applicant.dto.ApplicantDTO;
import com.bernardawj.bbank.applicant.exception.ApplicantServiceException;
import com.bernardawj.bbank.applicant.service.ApplicantService;
import com.bernardawj.bbank.creditfacility.dto.CloseCreditFacilityDTO;
import com.bernardawj.bbank.creditfacility.dto.CreditFacilityDTO;
import com.bernardawj.bbank.creditfacility.dto.OpenCreditFacilityDTO;
import com.bernardawj.bbank.creditfacility.service.CreditFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProcessServiceImpl implements ProcessService {

    // Services
    private final ApplicantService applicantService;
    private final CreditFacilityService creditFacilityService;

    @Autowired
    public ProcessServiceImpl(
        ApplicantService applicantService,
        CreditFacilityService creditFacilityService
    ) {
        this.applicantService = applicantService;
        this.creditFacilityService = creditFacilityService;
    }

    @Override
    public CreditFacilityDTO openCreditFacilityForApplicant(OpenCreditFacilityDTO openCreditFacilityDTO) throws ApplicantServiceException {
        // Check if applicant exists and get the details
        Applicant applicant = this.applicantService.getApplicantForInternalProcessing(openCreditFacilityDTO.getApplicantId());
        return this.creditFacilityService.createCreditFacility(applicant, openCreditFacilityDTO.getCreditFacilityDTO());
    }

    @Override
    public CreditFacilityDTO closeCreditFacilityForApplicant(CloseCreditFacilityDTO closeCreditFacilityDTO) {
        return null;
    }

}
