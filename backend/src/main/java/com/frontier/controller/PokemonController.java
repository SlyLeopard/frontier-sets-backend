package com.frontier.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.frontier.repository.PokemonRepository;

import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
public class PokemonController {

    private final PokemonRepository pokemonRepository;

    @GetMapping("/pokemonTest")
    public String getMethodName(@RequestParam String param) {
        return new String("This is a test of the GET /pokemon endpoint");
    }

    @GetMapping("/pokemon/{id}")
    public String getPokemon(@PathVariable String id) {
        return pokemonRepository.getPokemonById(id);
    }
    
    
}
