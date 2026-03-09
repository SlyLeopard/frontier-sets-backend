package com.frontier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.frontier.model.PokemonSet;
import com.frontier.model.search.PokemonSetSearchCriteria;
import com.frontier.repository.PokemonSetRepository;
import com.frontier.service.base.BaseSetService;

@Service
public class PokemonSetService extends BaseSetService<PokemonSet, PokemonSetRepository> {

    private final MongoTemplate mongoTemplate;

    public PokemonSetService(PokemonSetRepository repo, MongoTemplate mongoTemplate) {
        super(repo);
        this.mongoTemplate = mongoTemplate;
    }

    public PokemonSet getSetByName(String name) {
        return repo.findByName(name);
    }

    public Iterable<PokemonSet> searchPokemonSets(PokemonSetSearchCriteria criteria) {
        return mongoTemplate.find(criteria.toQuery(), PokemonSet.class);
    }

}
