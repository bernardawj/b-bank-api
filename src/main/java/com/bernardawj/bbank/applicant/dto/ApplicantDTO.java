package com.bernardawj.bbank.applicant.dto;

import com.bernardawj.bbank.creditfacility.dto.CreditFacilityDTO;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
public class ApplicantDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String contactNo;
    private String email;
    private Double annualSalary;
    private List<CreditFacilityDTO> creditFacilities;

    public ApplicantDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(Double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public List<CreditFacilityDTO> getCreditFacilities() {
        return creditFacilities;
    }

    public void setCreditFacilities(List<CreditFacilityDTO> creditFacilities) {
        this.creditFacilities = creditFacilities;
    }

}
