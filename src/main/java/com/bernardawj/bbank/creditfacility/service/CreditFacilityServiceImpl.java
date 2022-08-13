package com.bernardawj.bbank.creditfacility.service;

import com.bernardawj.bbank.creditfacility.dto.CreateCreditFacilityDTO;
import com.bernardawj.bbank.creditfacility.dto.CreditFacilityDTO;
import com.bernardawj.bbank.creditfacility.mapper.CreditFacilityMapper;
import com.bernardawj.bbank.creditfacility.repository.CreditFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CreditFacilityServiceImpl implements CreditFacilityService {

    // Repositories
    private final CreditFacilityRepository creditFacilityRepository;

    // Services

    // Mappers
    private final CreditFacilityMapper creditFacilityMapper;

    @Autowired
    public CreditFacilityServiceImpl(
        CreditFacilityRepository creditFacilityRepository,
        CreditFacilityMapper creditFacilityMapper
    ) {
        this.creditFacilityRepository = creditFacilityRepository;
        this.creditFacilityMapper = creditFacilityMapper;
    }

    @Override
    public CreditFacilityDTO getOneCreditFacility(Long facilityId) {
        return null;
    }

    @Override
    public List<CreditFacilityDTO> getAllCreditFacilities() {
        return null;
    }

    @Override
    public CreditFacilityDTO openCreditFacilityForApplicant(CreateCreditFacilityDTO createCreditFacilityDTO) {
        return null;
    }

}
