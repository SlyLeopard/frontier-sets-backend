package com.frontier.controller;

// Imports
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.frontier.model.PokemonSet;
import com.frontier.model.search.PokemonSetSearchCriteria;
import com.frontier.service.PokemonSetService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// Annotations
@RestController

// Class
public class PokemonSetController {

    // Attributes
    private PokemonSetService service;

    // Endpoints
    @GetMapping(value = "/pokemonSet/{name}")
    public PokemonSet getPokemonSetByName(@PathVariable String name) {
        return service.getSetByName(name);
    }

    @GetMapping(value = "/allPokemonSets")
    public Iterable<PokemonSet> getAllPokemonSets() {
        return service.getAll();
    }

    @PostMapping(value = "/searchPokemonSets", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<PokemonSet> searchPokemonSets(
            @RequestBody(required = true) PokemonSetSearchCriteria searchCriteria) {
        return service.searchPokemonSets(searchCriteria);
    }

}
