package com.frontier.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.frontier.repository.PokemonSetRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class PokemonSetController {

    private final PokemonSetRepository pokemonSetRepository;

    @GetMapping("/pokemonSetTest")
    public String getMethodName(@RequestParam String param) {
        return new String("This is a test of the GET /pokemonSet endpoint");
    }

    @GetMapping("/pokemonSet/${id}")
    public String getPokemonSet(@RequestParam String param) {
        return pokemonSetRepository.getPokemonSetById();
    }

    
}
