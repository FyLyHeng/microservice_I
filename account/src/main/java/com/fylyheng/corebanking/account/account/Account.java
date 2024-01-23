package com.fylyheng.corebanking.account.account;


import com.fylyheng.corebanking.account.customer.Customer;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
@Data
public class Account {

    private Long accountId;
    private String accountNumber;
    private String accountType;
    private String branchAddress;
    private LocalDate createDate;

    private Long customerId;
    private Customer customer;
}
