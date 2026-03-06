package com.frontier.repository;

// Imports
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.frontier.model.Trainer;

// Annotations
@Repository

// Class
public interface TrainerRepository extends MongoRepository<Trainer, String> {

    // Methods
    public Optional<Trainer> findById(String id);

    public Trainer findByName(String name);

    public Integer findRankByName(String name);

    public List<Trainer> findAll();

}
