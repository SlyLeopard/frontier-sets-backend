package com.frontier.model.search;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.frontier.enums.Nature;

import lombok.Data;

@Data
public class PokemonSetSearchCriteria {
    
    private String species;
    private Integer rank;
    private Nature nature;
    private String name;
    private String item;
    private Integer generation;

    public Query toQuery() {

        Query query = new Query();

        // Unique to PokemonSet
        addIfPresent(query, "rank", rank);
        addIfPresent(query, "generation", generation);

        // Used in all Sets
        addIfPresent(query, "species", species);
        addIfPresent(query, "nature", nature);
        addIfPresent(query, "item", item);
        addIfPresent(query, "name", name);

        return query;
    }

    private void addIfPresent(Query query, String field, Object value) {
        if (value != null) {
            query.addCriteria(Criteria.where(field).is(value));
        }
    }

}
