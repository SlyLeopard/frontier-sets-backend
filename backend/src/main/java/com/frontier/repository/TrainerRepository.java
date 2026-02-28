package com.frontier.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.frontier.model.Trainer;

@Repository
public interface TrainerRepository extends MongoRepository<Trainer, String> {

    public Trainer getTrainerByName(String name);
    
}
