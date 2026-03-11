package com.frontier.service;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.frontier.model.CustomSet;
import com.frontier.model.dto.CustomSetDTO;
import com.frontier.repository.CustomSetRepository;
import com.frontier.search.CustomSetSearchCriteria;
import com.frontier.service.base.BaseSetService;

@Service
public class CustomSetService extends BaseSetService<CustomSet, CustomSetRepository, CustomSetSearchCriteria, CustomSetDTO> {

    public CustomSetService(CustomSetRepository repo, MongoTemplate mongoTemplate) {
        super(repo, mongoTemplate, CustomSet.class, CustomSetDTO::fromEntity);
    }

    

}
