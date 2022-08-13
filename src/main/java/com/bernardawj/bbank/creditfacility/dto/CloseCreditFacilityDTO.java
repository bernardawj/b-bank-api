package com.bernardawj.bbank.creditfacility.dto;

public class CloseCreditFacilityDTO {

    private Long creditFacilityId;
    private Long applicantId;

    public CloseCreditFacilityDTO() {
    }

    public Long getCreditFacilityId() {
        return creditFacilityId;
    }

    public void setCreditFacilityId(Long creditFacilityId) {
        this.creditFacilityId = creditFacilityId;
    }

    public Long getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
    }

}
