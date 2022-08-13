package com.bernardawj.bbank.applicant.service;

import com.bernardawj.bbank.applicant.domain.Applicant;
import com.bernardawj.bbank.applicant.dto.ApplicantDTO;
import com.bernardawj.bbank.applicant.exception.ApplicantServiceException;

import java.util.List;

public interface ApplicantService {

    Applicant getApplicantForInternalProcessing(Long applicantId) throws ApplicantServiceException;

    ApplicantDTO getApplicant(Long applicantId) throws ApplicantServiceException;

    List<ApplicantDTO> getAllApplicants();

}
