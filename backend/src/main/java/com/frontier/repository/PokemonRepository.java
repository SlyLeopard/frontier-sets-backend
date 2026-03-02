package com.frontier.repository;

// Imports
import org.springframework.stereotype.Repository;

// Annotations
@Repository

// Class
public class PokemonRepository {

    // Methods
    public String getPokemonById(String id) {
        return new String("This is a test of the GET /pokemon/" + id + " endpoint");
    }
    
}
