package com.frontier.search;

import org.springframework.data.mongodb.core.query.Query;

import com.frontier.search.base.BaseSearchCriteria;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class TrainerSearchCriteria extends BaseSearchCriteria {

    private Integer rank;
    private String job;

    @Override
    public Query toQuery() {

        Query query = new Query();
        addIfPresent(query, "rank", rank);
        addIfPresent(query, "job", job);
        addBaseCriteria(query);
        return query;
        
    }
    
}
