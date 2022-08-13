package com.bernardawj.bbank.base.service;

import com.bernardawj.bbank.applicant.domain.Applicant;
import com.bernardawj.bbank.applicant.dto.ApplicantDTO;
import com.bernardawj.bbank.applicant.exception.ApplicantServiceException;
import com.bernardawj.bbank.applicant.mapper.ApplicantMapper;
import com.bernardawj.bbank.applicant.repository.ApplicantRepository;
import com.bernardawj.bbank.base.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ApplicantServiceImpl implements ApplicantService {

    // Repositories
    private final ApplicantRepository applicantRepository;

    // Services

    // Mappers
    private final ApplicantMapper applicantMapper;

    @Autowired
    public ApplicantServiceImpl(
        ApplicantRepository applicantRepository,
        ApplicantMapper applicantMapper
    ) {
        this.applicantRepository = applicantRepository;
        this.applicantMapper = applicantMapper;
    }

    @Override
    public ApplicantDTO getApplicant(Long applicantId) throws ApplicantServiceException {
        // Check if applicant exists
        Applicant applicant = this.applicantRepository.findById(applicantId)
                                  .orElseThrow(() -> new ApplicantServiceException(Constant.APPLICANT_NOT_FOUND));

        return this.applicantMapper.toDTO(applicant);
    }

    @Override
    public List<ApplicantDTO> getAllApplicants() {
        return this.applicantMapper.toDTO(this.applicantRepository.findAll());
    }

}
