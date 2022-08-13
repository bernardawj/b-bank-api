package com.bernardawj.bbank.credit.facility.dto;

import com.bernardawj.bbank.credit.facility.enumeration.LoanType;
import com.bernardawj.bbank.creditfacility.facility.LoanType;

import java.time.LocalDate;

public class CreditFacilityDTO {

    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private String currency;
    private Double totalLimit;
    private LoanType loanType;

    public CreditFacilityDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getTotalLimit() {
        return totalLimit;
    }

    public void setTotalLimit(Double totalLimit) {
        this.totalLimit = totalLimit;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

}
