package com.bernardawj.bbank.credit.loan.service;

import com.bernardawj.bbank.credit.facility.domain.CreditFacility;
import com.bernardawj.bbank.credit.loan.dto.CreateLoanDTO;
import com.bernardawj.bbank.credit.loan.dto.LoanDTO;
import com.bernardawj.bbank.credit.loan.dto.UpdateLoanDTO;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class LoanServiceImpl implements LoanService {

    @Override
    public LoanDTO getOneLoan(Long loanId) {
        return null;
    }

    @Override
    public List<LoanDTO> getAllLoans() {
        return null;
    }

    @Override
    public LoanDTO createLoan(CreditFacility creditFacility, CreateLoanDTO createLoanDTO) {
        return null;
    }

    @Override
    public LoanDTO updateLoan(CreditFacility creditFacility, UpdateLoanDTO updateLoanDTO) {
        return null;
    }

}
