package com.frontier.service;

import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.frontier.model.Trainer;
import com.frontier.repository.TrainerRepository;
import com.frontier.search.TrainerSearchCriteria;
import com.frontier.service.base.BaseService;

@Service
public class TrainerService extends BaseService<Trainer, TrainerRepository, TrainerSearchCriteria> {

    public TrainerService(TrainerRepository repo, MongoTemplate mongoTemplate) {
        super(repo, mongoTemplate);
    }

    public Page<Trainer> search(TrainerSearchCriteria criteria) {
        return super.search(criteria, Trainer.class);
    }

}
