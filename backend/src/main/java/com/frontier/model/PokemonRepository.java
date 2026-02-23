package com.frontier.model;

import org.springframework.stereotype.Repository;

@Repository
public class PokemonRepository {

    public String getPokemonById() {
        return new String("This is a test of the GET /pokemon/${id} endpoint");
    }
    
}
