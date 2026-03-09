package com.frontier.search;

import org.springframework.data.mongodb.core.query.Query;
import com.frontier.search.base.BaseSetSearchCriteria;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PokemonSetSearchCriteria extends BaseSetSearchCriteria{
    
    private Integer rank;
    private Integer generation;

    @Override
    public Query toQuery() {

        Query query = new Query();
        addIfPresent(query, "rank", rank);
        addIfPresent(query, "generation", generation);
        addBaseSetCriteria(query);
        
        return query;
    }

}
