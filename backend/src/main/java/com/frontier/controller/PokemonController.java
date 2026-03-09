package com.frontier.controller;

// Imports
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.frontier.model.Pokemon;
import com.frontier.service.PokemonService;

// Annotations
@RestController

// Class
public class PokemonController {

    // Attributes
    private PokemonService service;

    // Endpoints
    @GetMapping(value = "/pokemon/{name}")
    public Pokemon getPokemonByName(@PathVariable String name) {
        return service.getPokemonByName(name);
    }

    @GetMapping(value = "/allPokemon")
    public Iterable<Pokemon> getPokemon() {
        return service.getPokemon();
    }

}
