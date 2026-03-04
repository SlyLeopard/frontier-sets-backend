package com.frontier.repository;

import java.util.List;
import java.util.Optional;

// Imports
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.frontier.model.Pokemon;

// Annotations
@Repository

// Class
public interface PokemonRepository extends MongoRepository<Pokemon, String> {

    // Methods
    public Optional<Pokemon> findById(String id);
    
    public Pokemon findByDex(Integer dex);

    public Pokemon findByName(String name);

    public List<Pokemon> findAll();
}
