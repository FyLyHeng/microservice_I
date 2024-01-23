package com.fylyheng.corebacking.loan;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
@Data
public class Loan {

    private Long loanId;
    private String loanNumber;
    private String loanType;

    private Double totalLoan;
    private Double amountPaid;
    private String outstandingAmount;

    private LocalDate startDate;
    private LocalDate createDate;

    private Long customerId;
}
