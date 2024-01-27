package com.fylyheng.corebacking.loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService implements ILoanService {

    private final LoanRepo loanRepo;


    @Autowired
    public LoanService(LoanRepo loanRepo) {
        this.loanRepo = loanRepo;
    }


    public Loan createNew(Loan loan) {
        return loanRepo.save(loan);
    }


    @Override
    public List<Loan> listAccounts() {
        return loanRepo.findAll();
    }

    @Override
    public Loan getById(Long accountId) {
        return loanRepo.findByLoanId(accountId).orElseThrow( () -> new RuntimeException("Loan Not Found"));
    }

}
