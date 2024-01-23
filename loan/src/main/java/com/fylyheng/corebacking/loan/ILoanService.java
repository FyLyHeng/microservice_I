package com.fylyheng.corebacking.loan;

import java.util.List;

public interface ILoanService {

    Loan createNew(Loan loan);
    List<Loan> listAccounts();

    Loan getById(Long LoanId);
}
