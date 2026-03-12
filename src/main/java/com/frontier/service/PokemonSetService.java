package com.frontier.service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Service;

import com.frontier.model.Pokemon;
import com.frontier.model.PokemonSet;
import com.frontier.model.dto.CombinedPokemonSetDTO;
import com.frontier.model.dto.PokemonSetDTO;
import com.frontier.model.dto.PokemonDTO;
import com.frontier.repository.PokemonSetRepository;
import com.frontier.search.PokemonSetSearchCriteria;
import com.frontier.service.base.BaseSetService;

@Service
public class PokemonSetService
        extends BaseSetService<PokemonSet, PokemonSetRepository, PokemonSetSearchCriteria, PokemonSetDTO> {

    public PokemonSetService(PokemonSetRepository repo, MongoTemplate mongoTemplate, PokemonService pokemonService) {
        super(repo, mongoTemplate, PokemonSet.class, PokemonSetDTO::fromEntity);
    }

    public Page<CombinedPokemonSetDTO> combinedSearch(PokemonSetSearchCriteria criteria, Pageable pageable) {

        Query query = criteria.toQuery();
        query.with(pageable);
        List<PokemonSet> sets = mongoTemplate.find(query, PokemonSet.class);
        Set<String> pokemonNames = sets.stream().map(PokemonSet::getSpecies).collect(Collectors.toSet());

        Query pokemonNameQuery = new Query(
                Criteria.where("name").in(pokemonNames));

        List<PokemonDTO> pokemonList = mongoTemplate.find(pokemonNameQuery, Pokemon.class).stream()
                .map(p -> PokemonDTO.fromEntity(p)).toList();

        Map<String, PokemonDTO> pokemonNameMap = pokemonList.stream()
                .collect(Collectors.toMap(PokemonDTO::getName, p -> p));

        List<CombinedPokemonSetDTO> combined = sets.stream()
                .map(set -> {
                    PokemonDTO pokemon = pokemonNameMap.get(set.getSpecies());
                    return CombinedPokemonSetDTO.fromEntity(
                            set,
                            pokemon);
                }).toList();

        return PageableExecutionUtils.getPage(
                combined,
                pageable,
                () -> mongoTemplate.count(query.skip(0).limit(0), PokemonSet.class));
    }

}
