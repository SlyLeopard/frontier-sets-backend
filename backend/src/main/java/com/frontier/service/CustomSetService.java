package com.frontier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.frontier.model.CustomSet;
import com.frontier.model.search.CustomSetSearchCriteria;
import com.frontier.repository.CustomSetRepository;
import com.frontier.service.base.BaseSetService;

@Service
public class CustomSetService extends BaseSetService<CustomSet> {

    @Autowired
    private final CustomSetRepository customSetRepo;

    private final MongoTemplate mongoTemplate;

    public CustomSetService(CustomSetRepository repo, MongoTemplate mongoTemplate) {
        super(repo);
        this.customSetRepo = repo;
        this.mongoTemplate = mongoTemplate;
    }

    public CustomSet getSetByName(String name) {
        return customSetRepo.findByName(name);
    }

    public Iterable<CustomSet> searchCustomSets(CustomSetSearchCriteria criteria) {
        return mongoTemplate.find(criteria.toQuery(), CustomSet.class);
    }

}
