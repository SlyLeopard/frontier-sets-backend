package com.frontier.repository;

import org.springframework.stereotype.Repository;

@Repository
public class PokemonSetRepository {
    
    public String getPokemonSetById(String id) {
        return new String("This is a test of the GET /pokemonSet/" + id + " endpoint");
    }
}
