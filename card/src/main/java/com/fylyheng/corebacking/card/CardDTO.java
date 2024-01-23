package com.fylyheng.corebacking.card;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class CardDTO {

    public String cardNumber;
    public String cardType;
    public BigDecimal cardLimit;
    public BigDecimal amountUsed;
    public BigDecimal availableAmount;
    public Long customerId;

}
