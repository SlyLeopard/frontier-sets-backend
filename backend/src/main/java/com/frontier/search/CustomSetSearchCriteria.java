package com.frontier.search;

import org.springframework.data.mongodb.core.query.Query;

import com.frontier.search.base.BaseSetSearchCriteria;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class CustomSetSearchCriteria extends BaseSetSearchCriteria {

    @Override
    public Query toQuery() {

        Query query = new Query();
        addBaseSetCriteria(query);
        return query;

    }

}
