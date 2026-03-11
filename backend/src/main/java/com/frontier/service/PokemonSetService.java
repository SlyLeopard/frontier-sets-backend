package com.frontier.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Service;

import com.frontier.model.PokemonSet;
import com.frontier.model.dto.CombinedPokemonSetDTO;
import com.frontier.model.dto.PokemonSetDTO;
import com.frontier.repository.PokemonSetRepository;
import com.frontier.search.PokemonSetSearchCriteria;
import com.frontier.service.base.BaseSetService;

@Service
public class PokemonSetService extends BaseSetService<PokemonSet, PokemonSetRepository, PokemonSetSearchCriteria, PokemonSetDTO> {

    private PokemonService pokemonService;

    public PokemonSetService(PokemonSetRepository repo, MongoTemplate mongoTemplate, PokemonService pokemonService) {
        super(repo, mongoTemplate, PokemonSet.class, PokemonSetDTO::fromEntity);
        this.pokemonService = pokemonService;
    }

    public Page<CombinedPokemonSetDTO> combinedSearch(PokemonSetSearchCriteria criteria) {

        Query query = criteria.toQuery();
        Pageable pageable = criteria.toPageable();
        query.with(pageable);
        List<PokemonSet> results = mongoTemplate.find(query, PokemonSet.class);
        List<CombinedPokemonSetDTO> combinedResults = new ArrayList<CombinedPokemonSetDTO>();
        for (PokemonSet set : results) {
            combinedResults.add(toCombinedDTO(set));
        }
        return PageableExecutionUtils.getPage(
                combinedResults,
                pageable,
                () -> mongoTemplate.count(query.skip(0).limit(0), PokemonSet.class));
    }

    public CombinedPokemonSetDTO toCombinedDTO(PokemonSet set) {
        CombinedPokemonSetDTO dto = new CombinedPokemonSetDTO();
        dto.setName(set.getName());
        dto.setSpecies(set.getSpecies());
        dto.setPokemon(pokemonService.getByName(set.getSpecies()).orElse(null));
        dto.setNature(set.getNature());
        dto.setItem(set.getItem());
        dto.setEv(set.getEv());
        dto.setMoves(set.getMoves());
        dto.setRank(set.getRank());
        dto.setGeneration(set.getGeneration());
        return dto;
    }



}
