package com.frontier.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.frontier.model.CustomSet;

public interface CustomSetRepository extends MongoRepository<CustomSet, String> {
    
    // Methods
    public CustomSet findByName(String name);

    public List<CustomSet> findBySpecies(String species);

}
