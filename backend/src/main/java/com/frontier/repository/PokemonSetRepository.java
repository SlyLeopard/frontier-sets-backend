package com.frontier.repository;

// Imports
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.frontier.model.PokemonSet;

// Annotations
@Repository

// Class
public interface PokemonSetRepository extends MongoRepository<PokemonSet, String> {
    
    // Methods
    public Optional<PokemonSet> findById(String id);

    public PokemonSet findByName(String name);

    public List<PokemonSet> findBySpecies(String species);

    public List<PokemonSet> findByRankAndSpecies(Integer rank, String species);

    public List<PokemonSet> findAll();
}
