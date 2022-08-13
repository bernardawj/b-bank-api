package com.bernardawj.bbank.credit.loan.dto;

public class UpdateLoanDTO extends LoanRequestDTO {

    private Long id;

    public UpdateLoanDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
