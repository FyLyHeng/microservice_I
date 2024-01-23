package com.fylyheng.corebacking.card;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepo extends MongoRepository<Card, Long> {
}
