package com.bernardawj.bbank.creditfacility.service;

import com.bernardawj.bbank.creditfacility.dto.CreateCreditFacilityDTO;
import com.bernardawj.bbank.creditfacility.dto.CreditFacilityDTO;

import java.util.List;

public interface CreditFacilityService {

    CreditFacilityDTO getOneCreditFacility(Long facilityId);

    List<CreditFacilityDTO> getAllCreditFacilities();

    CreditFacilityDTO openCreditFacilityForApplicant(CreateCreditFacilityDTO createCreditFacilityDTO);

}
