package com.frontier.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frontier.controller.base.BaseController;
import com.frontier.model.PokemonSet;
import com.frontier.search.PokemonSetSearchCriteria;
import com.frontier.service.PokemonSetService;

@CrossOrigin(origins = "${app.frontend.url}")
@RestController
@RequestMapping("/pokemon-set")
public class PokemonSetController extends BaseController<PokemonSet, PokemonSetSearchCriteria> {

    public PokemonSetController(PokemonSetService service) {
        super(service);
    }

}
