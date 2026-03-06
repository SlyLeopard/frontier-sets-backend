package com.frontier.controller;

// Imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.frontier.model.PokemonSet;
import com.frontier.model.SearchCriteria;
import com.frontier.repository.PokemonSetRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/searchPokemonSets")
    public Iterable<PokemonSet> searchPokemonSets(@RequestBody(required = true) SearchCriteria searchCriteria) {
        String species = searchCriteria.getSpecies();
        Integer rank = searchCriteria.getRank();
        if (rank != null && species != null) {
            return pokemonSetRepository.findByRankAndSpecies(rank, species);
        } else if (rank != null) {
            return pokemonSetRepository.findByRank(rank);
        } else if (species != null) {
            return pokemonSetRepository.findBySpecies(species);
        } else {
            return pokemonSetRepository.findAll();
        }
    }

}
