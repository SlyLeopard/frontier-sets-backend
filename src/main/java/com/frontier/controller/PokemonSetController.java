package com.frontier.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frontier.controller.base.BaseController;
import com.frontier.model.PokemonSet;
import com.frontier.model.dto.CombinedPokemonSetDTO;
import com.frontier.model.dto.PokemonSetDTO;
import com.frontier.search.PokemonSetSearchCriteria;
import com.frontier.service.PokemonSetService;

@RestController
@RequestMapping("/pokemon-set")
public class PokemonSetController extends BaseController<PokemonSet, PokemonSetSearchCriteria, PokemonSetDTO> {

    private final PokemonSetService service;

    public PokemonSetController(PokemonSetService service) {
        super(service);
        this.service = service;
    }

    @PostMapping("/combinedSearch")
    public ResponseEntity<Page<CombinedPokemonSetDTO>> combinedSearch(
            PokemonSetSearchCriteria criteria, Pageable pageable) {
        Page<CombinedPokemonSetDTO> results = service.combinedSearch(criteria, pageable);
        return ResponseEntity.ok(results);
    }

}
