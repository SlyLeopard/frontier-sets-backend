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

    public List<PokemonSet> findByPokemonDex(Integer dex);

    public List<PokemonSet> findByPokemonName(String name);

    public List<PokemonSet> findByRankAndPokemonName(Integer rank, String name);

    public List<PokemonSet> findAll();
}
