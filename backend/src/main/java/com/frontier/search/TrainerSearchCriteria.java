package com.frontier.search;

import org.springframework.data.mongodb.core.query.Query;

import com.frontier.search.base.BaseSearchCriteria;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class TrainerSearchCriteria extends BaseSearchCriteria {

    private Integer rank;
    private String trainerClass;

    @Override
    public Query toQuery() {

        Query query = new Query();
        addIfPresent(query, "rank", rank);
        addIfPresent(query, "trainerClass", trainerClass);
        addBaseCriteria(query);
        return query;
        
    }
    
}
