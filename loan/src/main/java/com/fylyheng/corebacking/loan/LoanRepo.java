package com.fylyheng.corebacking.loan;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepo extends MongoRepository<Loan, Long> {
}
