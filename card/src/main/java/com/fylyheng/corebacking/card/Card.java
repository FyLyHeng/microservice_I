package com.fylyheng.corebacking.card;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {

    private String cardNumber;
    private String cardType;

    private BigDecimal cardLimit;
    private BigDecimal amountUsed;
    private BigDecimal availableAmount;

    private LocalDate createDate;
    private Long customerId;
}
