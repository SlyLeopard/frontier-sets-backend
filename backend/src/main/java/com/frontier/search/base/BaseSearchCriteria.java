package com.frontier.search.base;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import lombok.Data;

@Data
public abstract class BaseSearchCriteria {

    private String name;
    private Integer page = 0;
    private Integer size = 20;
    private String sortBy;
    private Sort.Direction sortDirection = Sort.Direction.ASC;

    public abstract Query toQuery();

    protected void addIfPresent(Query query, String field, Object value) {
        if (value != null) {
            query.addCriteria(Criteria.where(field).is(value));
        }
    }

    public Pageable toPageable() {

        if (sortBy == null) {
            return PageRequest.of(page, size);
        }

        return PageRequest.of(page, size, Sort.by(sortDirection, sortBy));
    }

    public void addBaseCriteria(Query query) {

        addIfPresent(query, "name", name);
        
    }

}
