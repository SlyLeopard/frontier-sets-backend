package com.frontier.service;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.frontier.model.PokemonSet;
import com.frontier.repository.PokemonSetRepository;
import com.frontier.search.PokemonSetSearchCriteria;
import com.frontier.service.base.BaseSetService;

@Service
public class PokemonSetService extends BaseSetService<PokemonSet, PokemonSetRepository, PokemonSetSearchCriteria> {

    public PokemonSetService(PokemonSetRepository repo, MongoTemplate mongoTemplate) {
        super(repo, mongoTemplate, PokemonSet.class);
    }

}
