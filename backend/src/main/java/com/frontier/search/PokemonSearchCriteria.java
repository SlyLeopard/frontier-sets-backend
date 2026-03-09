package com.frontier.search;

import org.springframework.data.mongodb.core.query.Query;

import com.frontier.search.base.BaseSearchCriteria;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PokemonSearchCriteria extends BaseSearchCriteria {

    private Integer dex;

    @Override
    public Query toQuery() {

        Query query = new Query();
        addIfPresent(query, "dex", dex);
        addBaseCriteria(query);
        return query;
        
    }
    
}
