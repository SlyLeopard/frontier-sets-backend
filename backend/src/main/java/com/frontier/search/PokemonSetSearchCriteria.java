package com.frontier.search;

import org.springframework.data.mongodb.core.query.Query;
import com.frontier.enums.Nature;
import com.frontier.search.base.BaseSetSearchCriteria;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class PokemonSetSearchCriteria extends BaseSetSearchCriteria{
    
    private String species;
    private Integer rank;
    private Nature nature;
    private String name;
    private String item;
    private Integer generation;

    @Override
    public Query toQuery() {

        Query query = new Query();
        addIfPresent(query, "rank", rank);
        addIfPresent(query, "generation", generation);
        addBaseSetCriteria(query);
        addBaseCriteria(query);
        
        return query;
    }

}
