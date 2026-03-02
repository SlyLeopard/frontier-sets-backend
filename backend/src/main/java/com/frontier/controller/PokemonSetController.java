package com.frontier.controller;

// Imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.frontier.repository.PokemonSetRepository;

// Annotations
@RestController

// Class
public class PokemonSetController {

    // Attributes
    @Autowired
    private PokemonSetRepository pokemonSetRepository;

    // Endpoints
    @GetMapping("/pokemonSetTest")
    public String getMethodName(@RequestParam String param) {
        return new String("This is a test of the GET /pokemonSet endpoint");
    }

    @GetMapping("/pokemonSet/{id}")
    public String getPokemonSet(@PathVariable String id) {
        return pokemonSetRepository.getPokemonSetById(id);
    }

}
