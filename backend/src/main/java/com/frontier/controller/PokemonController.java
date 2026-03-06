package com.frontier.controller;

// Imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.frontier.model.Pokemon;
import com.frontier.repository.PokemonRepository;

// Annotations
@RestController

// Class
public class PokemonController {

    // Attributes
    @Autowired
    private PokemonRepository pokemonRepository;

    // Endpoints
    @GetMapping("/pokemon/{name}")
    public Pokemon getMethodName(@PathVariable String name) {
        return pokemonRepository.findByName(name);
    }

    @GetMapping("/allPokemon")
    public Iterable<Pokemon> getPokemon() {
        return pokemonRepository.findAll();
    }

}
