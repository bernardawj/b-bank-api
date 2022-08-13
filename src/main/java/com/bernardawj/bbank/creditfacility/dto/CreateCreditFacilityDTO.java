package com.bernardawj.bbank.creditfacility.dto;

import com.bernardawj.bbank.applicant.dto.ApplicantDTO;

public class CreateCreditFacilityDTO {

    private ApplicantDTO applicantDTO;
    private CreditFacilityDTO creditFacilityDTO;

    public CreateCreditFacilityDTO() {
    }

    public ApplicantDTO getApplicantDTO() {
        return applicantDTO;
    }

    public void setApplicantDTO(ApplicantDTO applicantDTO) {
        this.applicantDTO = applicantDTO;
    }

    public CreditFacilityDTO getCreditFacilityDTO() {
        return creditFacilityDTO;
    }

    public void setCreditFacilityDTO(CreditFacilityDTO creditFacilityDTO) {
        this.creditFacilityDTO = creditFacilityDTO;
    }

}
