package com.bernardawj.bbank.credit.loan.resource;

import com.bernardawj.bbank.credit.loan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(name = "/api/v1/loan")
public class LoanResource {

    // Services
    private final LoanService loanService;

    @Autowired
    public LoanResource(LoanService loanService) {
        this.loanService = loanService;
    }
}
