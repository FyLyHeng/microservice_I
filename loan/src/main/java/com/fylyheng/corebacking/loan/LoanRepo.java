package com.fylyheng.corebacking.loan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoanRepo extends JpaRepository<Loan, Long> {

    Optional<Loan> findByLoanId(Long acc);
}
