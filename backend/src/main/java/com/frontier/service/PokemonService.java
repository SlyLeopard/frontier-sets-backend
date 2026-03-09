package com.frontier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frontier.model.Pokemon;
import com.frontier.repository.PokemonRepository;

@Service
public class PokemonService {

        // Attributes
    @Autowired
    private PokemonRepository pokemonRepository;

    public Pokemon getPokemonByName(String name) {
        return pokemonRepository.findByName(name);
    }

    public Iterable<Pokemon> getPokemon() {
        return pokemonRepository.findAll();
    }
    
}
