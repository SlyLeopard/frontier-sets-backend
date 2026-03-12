package com.frontier.search.base;

import org.springframework.data.mongodb.core.query.Query;

import com.frontier.enums.Nature;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class BaseSetSearchCriteria extends BaseSearchCriteria {

    private String species;
    private Nature nature;
    private String item;

    public abstract Query toQuery();

    protected void addBaseSetCriteria(Query query) {

        addIfPresent(query, "species", species);
        addIfPresent(query, "nature", nature);
        addIfPresent(query, "item", item);
        addBaseCriteria(query);
        
    }

}
