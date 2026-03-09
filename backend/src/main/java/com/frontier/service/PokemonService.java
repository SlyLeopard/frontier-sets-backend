package com.frontier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frontier.model.Pokemon;
import com.frontier.repository.PokemonRepository;

@Service
public class PokemonService {

    // Attributes
    @Autowired
    private PokemonRepository pokemonRepo;

    public Pokemon getPokemonByName(String name) {
        return pokemonRepo.findByName(name);
    }

    public Iterable<Pokemon> getPokemon() {
        return pokemonRepo.findAll();
    }

}
