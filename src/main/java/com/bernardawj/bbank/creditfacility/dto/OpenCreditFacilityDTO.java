package com.bernardawj.bbank.creditfacility.dto;

public class OpenCreditFacilityDTO {

    private Long applicantId;
    private CreditFacilityDTO creditFacilityDTO;

    public OpenCreditFacilityDTO() {
    }

    public Long getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
    }

    public CreditFacilityDTO getCreditFacilityDTO() {
        return creditFacilityDTO;
    }

    public void setCreditFacilityDTO(CreditFacilityDTO creditFacilityDTO) {
        this.creditFacilityDTO = creditFacilityDTO;
    }

}
