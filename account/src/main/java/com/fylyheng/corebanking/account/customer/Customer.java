package com.fylyheng.corebanking.account.customer;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
@Data
public class Customer {

    private Long customerId;
    private String name;
    private String email;
    private String phoneNumber;
    private LocalDate createDate;
}
