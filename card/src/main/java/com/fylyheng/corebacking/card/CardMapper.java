package com.fylyheng.corebacking.card;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardMapper {

    Card cardDtoToCard(CardDTO cardDTO);
}
