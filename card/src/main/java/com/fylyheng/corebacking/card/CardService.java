package com.fylyheng.corebacking.card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService implements ICardService {

    private final CardRepo cardRepo;


    @Autowired
    public CardService(CardRepo cardRepo) {
        this.cardRepo = cardRepo;
    }


    public Card createNew(Card card) {
        return cardRepo.save(card);
    }


    @Override
    public List<Card> listCards() {
        return cardRepo.findAll();
    }

    @Override
    public Card getById(Long cardId) {
        return cardRepo.findById(cardId).orElseThrow( () -> new RuntimeException("Loan Not Found"));
    }

}
