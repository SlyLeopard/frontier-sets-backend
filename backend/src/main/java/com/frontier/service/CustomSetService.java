package com.frontier.service;

import java.util.function.Function;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.frontier.model.CustomSet;
import com.frontier.model.dto.CustomSetDTO;
import com.frontier.repository.CustomSetRepository;
import com.frontier.search.CustomSetSearchCriteria;
import com.frontier.service.base.BaseSetService;

@Service
public class CustomSetService extends BaseSetService<CustomSet, CustomSetRepository, CustomSetSearchCriteria, CustomSetDTO> {

    public CustomSetService(CustomSetRepository repo, MongoTemplate mongoTemplate, Function<CustomSet, CustomSetDTO> mapper) {
        super(repo, mongoTemplate, CustomSet.class, CustomSetDTO::fromEntity);
    }

    

}
