package com.frontier.service;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.frontier.model.Pokemon;
import com.frontier.model.dto.PokemonDTO;
import com.frontier.repository.PokemonRepository;
import com.frontier.search.PokemonSearchCriteria;
import com.frontier.service.base.BaseService;

@Service
public class PokemonService extends BaseService<Pokemon, PokemonRepository, PokemonSearchCriteria, PokemonDTO> {

    public PokemonService(PokemonRepository repo, MongoTemplate mongoTemplate) {
        super(repo, mongoTemplate, Pokemon.class, PokemonDTO::fromEntity);
    }

}
