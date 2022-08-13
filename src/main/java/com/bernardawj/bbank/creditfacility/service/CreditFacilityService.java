package com.bernardawj.bbank.creditfacility.service;

import com.bernardawj.bbank.applicant.domain.Applicant;
import com.bernardawj.bbank.creditfacility.dto.CloseCreditFacilityDTO;
import com.bernardawj.bbank.creditfacility.dto.OpenCreditFacilityDTO;
import com.bernardawj.bbank.creditfacility.dto.CreditFacilityDTO;
import com.bernardawj.bbank.creditfacility.exception.CreditFacilityServiceException;

import java.util.List;

public interface CreditFacilityService {

    CreditFacilityDTO getOneCreditFacility(Long facilityId) throws CreditFacilityServiceException;

    List<CreditFacilityDTO> getAllCreditFacilities();

    CreditFacilityDTO createCreditFacility(Applicant applicant, CreditFacilityDTO creditFacilityDTO);

}
