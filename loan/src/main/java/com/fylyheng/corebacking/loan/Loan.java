package com.fylyheng.corebacking.loan;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDate;


@Data
@Entity
public class Loan {

    @Id
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
