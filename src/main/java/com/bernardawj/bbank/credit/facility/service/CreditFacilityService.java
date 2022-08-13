package com.bernardawj.bbank.credit.facility.service;

import com.bernardawj.bbank.applicant.domain.Applicant;
import com.bernardawj.bbank.credit.facility.exception.CreditFacilityServiceException;
import com.bernardawj.bbank.credit.facility.dto.CreditFacilityDTO;

import java.util.List;

public interface CreditFacilityService {

    CreditFacilityDTO getOneCreditFacility(Long facilityId) throws CreditFacilityServiceException;

    List<CreditFacilityDTO> getAllCreditFacilities();

    CreditFacilityDTO createCreditFacility(Applicant applicant, CreditFacilityDTO creditFacilityDTO);

}
