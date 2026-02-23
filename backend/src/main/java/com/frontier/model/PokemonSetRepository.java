package com.frontier.model;

import org.springframework.stereotype.Repository;

@Repository
public class PokemonSetRepository {
    
    public String getPokemonSetById() {
        return new String("This is a test of the GET /pokemonSet/${id} endpoint");
    }
}
