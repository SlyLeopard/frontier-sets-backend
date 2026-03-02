package com.frontier.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.frontier.model.Trainer;

@Repository
public interface TrainerRepository extends MongoRepository<Trainer, String> {

    public Trainer getTrainerByName(String name);

    public List<Trainer> findAll(); 
    
}
