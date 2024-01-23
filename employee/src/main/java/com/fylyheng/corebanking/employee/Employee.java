package com.fylyheng.corebanking.employee;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private Long employeeId;
    private String name;
    private String email;
    private String phoneNumber;
    private LocalDate createDate;
}
