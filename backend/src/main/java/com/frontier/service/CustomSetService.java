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
        super(repo, mongoTemplate, CustomSet.class);
    }

    public CustomSetDTO toDTO(CustomSet set) {
        CustomSetDTO dto = new CustomSetDTO();
        dto.setName(set.getName());
        dto.setSpecies(set.getSpecies());
        dto.setNature(set.getNature());
        dto.setItem(set.getItem());
        dto.setEv(set.getEv());
        dto.setIv(set.getIv());
        dto.setMoves(set.getMoves());
        return dto;
    }

}
