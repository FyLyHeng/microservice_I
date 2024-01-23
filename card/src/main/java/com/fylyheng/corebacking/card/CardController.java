package com.fylyheng.corebacking.card;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/card")
public class CardController {

    private final ICardService cardService;
    private final CardMapper cardMapper;



    @Autowired
    public CardController(CardService cardService, CardMapper cardMapper) {
        this.cardService = cardService;
        this.cardMapper = cardMapper;
    }

    @PostMapping
    ResponseEntity<?> createNew(@RequestBody CardDTO card) {


        System.out.println("body "+ card.cardType);
        //log.info("body "+ card.cardType);
        var data = cardService.createNew(cardMapper.cardDtoToCard(card));
        return ResponseEntity.status(HttpStatus.CREATED).body(data);
    }

    @GetMapping("/list")
    ResponseEntity<?> list() {
        return ResponseEntity.ok(cardService.listCards());
    }

    @GetMapping("/{cardId}")
    ResponseEntity<?> getById(@PathVariable Long cardId) {
        return ResponseEntity.ok(cardService.getById(cardId));
    }

}
