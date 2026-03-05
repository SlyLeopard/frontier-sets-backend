package com.frontier.controller;

// Imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.frontier.model.PokemonSet;
import com.frontier.repository.PokemonSetRepository;

// Annotations
@RestController

// Class
public class PokemonSetController {

    // Attributes
    @Autowired
    private PokemonSetRepository pokemonSetRepository;

    // Endpoints
    @GetMapping("/pokemonSet/{name}")
    public PokemonSet getMethodName(@PathVariable String name) {
        return pokemonSetRepository.findByName(name);
    }

    @GetMapping("/allPokemonSets")
    public Iterable<PokemonSet> getPokemon() {
        return pokemonSetRepository.findAll();
    }

}
