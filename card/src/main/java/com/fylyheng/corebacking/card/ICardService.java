package com.fylyheng.corebacking.card;

import java.util.List;

public interface ICardService {

    Card createNew(Card card);
    List<Card> listCards();

    Card getById(Long LoanId);
}
