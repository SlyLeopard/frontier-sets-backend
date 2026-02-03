package com.frontier.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.Getter;
import lombok.Setter;


@Controller
public class PokemonController {

    private final PokemonRepository PokemonRepository;

    public PokemonController(PokemonRepository pokemonRepository) {
        this.PokemonRepository = pokemonRepository;
    }

    @GetMapping("/pokemon")
    public String getMethodName(@RequestParam String param) {
        return new String("This is a test of the GET /pokemon endpoint");
    }
    
}
