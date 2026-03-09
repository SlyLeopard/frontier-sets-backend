package com.frontier.controller;

// Imports
import org.springframework.web.bind.annotation.RestController;
import com.frontier.controller.base.BaseController;
import com.frontier.model.PokemonSet;
import com.frontier.search.PokemonSetSearchCriteria;
import com.frontier.service.PokemonSetService;
import org.springframework.web.bind.annotation.RequestMapping;

// Annotations
@RestController
@RequestMapping("/pokemon-set")

// Class
public class PokemonSetController extends BaseController<PokemonSet, PokemonSetSearchCriteria> {

    public PokemonSetController(PokemonSetService service) {
        super(service);
    }

}
