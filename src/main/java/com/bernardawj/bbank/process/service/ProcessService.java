package com.bernardawj.bbank.process.service;

import com.bernardawj.bbank.applicant.exception.ApplicantServiceException;
import com.bernardawj.bbank.creditfacility.dto.CloseCreditFacilityDTO;
import com.bernardawj.bbank.creditfacility.dto.CreditFacilityDTO;
import com.bernardawj.bbank.creditfacility.dto.OpenCreditFacilityDTO;

public interface ProcessService {

    CreditFacilityDTO openCreditFacilityForApplicant(OpenCreditFacilityDTO openCreditFacilityDTO) throws ApplicantServiceException;

    CreditFacilityDTO closeCreditFacilityForApplicant(CloseCreditFacilityDTO closeCreditFacilityDTO);

}
