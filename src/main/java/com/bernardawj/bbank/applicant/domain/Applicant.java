package com.bernardawj.bbank.applicant.domain;

import com.bernardawj.bbank.credit.facility.domain.CreditFacility;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "applicants")
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "contact_no")
    private String contactNo;

    @Column(name = "email")
    private String email;

    @Column(name = "annual_salary")
    private Double annualSalary;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "applicant_id")
    private List<CreditFacility> creditFacilities;

    public Applicant() {
    }

    public Long getId() {
        return id;
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

    public List<CreditFacility> getCreditFacilities() {
        return creditFacilities;
    }

    public void setCreditFacilities(List<CreditFacility> creditFacilities) {
        this.creditFacilities = creditFacilities;
    }

}
