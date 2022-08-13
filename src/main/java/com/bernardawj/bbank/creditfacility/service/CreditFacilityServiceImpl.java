package com.bernardawj.bbank.creditfacility.service;

import com.bernardawj.bbank.applicant.domain.Applicant;
import com.bernardawj.bbank.base.util.Constant;
import com.bernardawj.bbank.creditfacility.domain.CreditFacility;
import com.bernardawj.bbank.creditfacility.dto.CloseCreditFacilityDTO;
import com.bernardawj.bbank.creditfacility.dto.OpenCreditFacilityDTO;
import com.bernardawj.bbank.creditfacility.dto.CreditFacilityDTO;
import com.bernardawj.bbank.creditfacility.exception.CreditFacilityServiceException;
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
    public CreditFacilityDTO getOneCreditFacility(Long facilityId) throws CreditFacilityServiceException {
        // Check if credit facility exists
        CreditFacility creditFacility = this.creditFacilityRepository.findById(facilityId)
                                            .orElseThrow(() -> new CreditFacilityServiceException(Constant.CREDIT_FACILITY_NOT_FOUND));

        return this.creditFacilityMapper.toDTO(creditFacility);
    }

    @Override
    public List<CreditFacilityDTO> getAllCreditFacilities() {
        return this.creditFacilityMapper.toDTO(this.creditFacilityRepository.findAll());
    }

    @Override
    public CreditFacilityDTO createCreditFacility(Applicant applicant, CreditFacilityDTO creditFacilityDTO) {
        // Map and save credit facility
        CreditFacility creditFacility = this.creditFacilityMapper.toEntity(creditFacilityDTO);
        creditFacility.setApplicant(applicant);
        creditFacility = this.creditFacilityRepository.save(creditFacility);

        return this.creditFacilityMapper.toDTO(creditFacility);
    }

}
