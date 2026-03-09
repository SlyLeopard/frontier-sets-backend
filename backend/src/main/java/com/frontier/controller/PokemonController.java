package com.frontier.controller;

// Imports
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.frontier.controller.base.BaseController;
import com.frontier.model.Pokemon;
import com.frontier.search.PokemonSearchCriteria;
import com.frontier.service.PokemonService;

// Annotations
@RestController
@RequestMapping("/pokemon")

// Class
public class PokemonController extends BaseController<Pokemon, PokemonSearchCriteria> {

    public PokemonController(PokemonService service) {
        super(service);
    }

}
