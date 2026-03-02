package com.frontier.repository;

// Imports
import org.springframework.stereotype.Repository;

// Annotations
@Repository

// Class
public class PokemonSetRepository {
    
    // Methods
    public String getPokemonSetById(String id) {
        return new String("This is a test of the GET /pokemonSet/" + id + " endpoint");
    }
}
