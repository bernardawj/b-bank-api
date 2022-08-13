package com.bernardawj.bbank.credit.loan.service;

import com.bernardawj.bbank.credit.facility.domain.CreditFacility;
import com.bernardawj.bbank.credit.loan.dto.CreateLoanDTO;
import com.bernardawj.bbank.credit.loan.dto.LoanDTO;
import com.bernardawj.bbank.credit.loan.dto.UpdateLoanDTO;

import java.util.List;

public interface LoanService {

    LoanDTO getOneLoan(Long loanId);

    List<LoanDTO> getAllLoans();

    LoanDTO createLoan(CreditFacility creditFacility, CreateLoanDTO createLoanDTO);

    LoanDTO updateLoan(CreditFacility creditFacility, UpdateLoanDTO updateLoanDTO);

}
