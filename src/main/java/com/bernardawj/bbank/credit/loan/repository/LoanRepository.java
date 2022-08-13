package com.bernardawj.bbank.credit.loan.repository;

import com.bernardawj.bbank.credit.loan.domain.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
}
