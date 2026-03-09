package com.frontier.repository;

// Imports
import org.springframework.stereotype.Repository;
import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.frontier.model.PokemonSet;

// Annotations
@Repository

// Class
public interface PokemonSetRepository extends MongoRepository<PokemonSet, String> {

    // Methods
    public PokemonSet findByName(String name);

    public List<PokemonSet> findBySpecies(String species);

}
