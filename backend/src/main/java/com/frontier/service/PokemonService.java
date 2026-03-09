package com.frontier.service;

import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.frontier.model.Pokemon;
import com.frontier.repository.PokemonRepository;
import com.frontier.search.PokemonSearchCriteria;
import com.frontier.service.base.BaseService;

@Service
public class PokemonService extends BaseService<Pokemon, PokemonRepository, PokemonSearchCriteria> {

    public PokemonService(PokemonRepository repo, MongoTemplate mongoTemplate) {
        super(repo, mongoTemplate);
        
    }

    public Page<Pokemon> search(PokemonSearchCriteria criteria) {
        return super.search(criteria, Pokemon.class);
    }

}
