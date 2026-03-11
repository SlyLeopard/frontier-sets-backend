package com.frontier.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.frontier.controller.base.BaseController;
import com.frontier.model.PokemonSet;
import com.frontier.model.dto.CombinedPokemonSetDTO;
import com.frontier.model.dto.PokemonSetDTO;
import com.frontier.search.PokemonSetSearchCriteria;
import com.frontier.service.PokemonSetService;

@CrossOrigin(origins = "${app.frontend.url}")
@RestController
@RequestMapping("/pokemon-set")
public class PokemonSetController extends BaseController<PokemonSet, PokemonSetSearchCriteria, PokemonSetDTO> {

    private final PokemonSetService service;

    public PokemonSetController(PokemonSetService service) {
        super(service);
        this.service = service;
    }

    @PostMapping("/v1/search")
    public ResponseEntity<Page<CombinedPokemonSetDTO>> combinedSearch(
            PokemonSetSearchCriteria criteria,
            @RequestParam(required = false) Integer page,
            @RequestParam(required = false) Integer pageSize) {
        page = page == null ? 0 : page;
        pageSize = pageSize == null ? 20 : pageSize;
        pageSize = pageSize > 100 ? 100 : pageSize;
        criteria.setPage(page);
        criteria.setSize(pageSize);
        Page<CombinedPokemonSetDTO> results = service.combinedSearch(criteria);
        return ResponseEntity.ok(results);
    }

}
