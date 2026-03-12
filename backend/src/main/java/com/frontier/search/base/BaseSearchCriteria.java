package com.frontier.search.base;

import java.util.List;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import lombok.Data;

@Data
public abstract class BaseSearchCriteria {

    private String name;

    public abstract Query toQuery();

    protected void addIfPresent(Query query, String field, Object value) {
        if (value != null) {
            query.addCriteria(Criteria.where(field).is(value));
        }
    }

    protected void addBaseCriteria(Query query) {

        addIfPresent(query, "name", name);

    }

    protected void addRange(
            List<Criteria> criteriaList,
            Number min,
            Number max,
            String field) {

        if (min != null || max != null) {

            Criteria c = Criteria.where(field);

            if (min != null)
                c.gte(min);
            if (max != null)
                c.lte(max);

            criteriaList.add(c);
        }
    }

    protected void addInIfPresent(
            List<Criteria> criteriaList,
            List<?> values,
            String field) {

        if (values != null && !values.isEmpty()) {
            criteriaList.add(Criteria.where(field).in(values));
        }
    }

    protected void addRegexIfPresent(
            List<Criteria> criteriaList,
            String value,
            String field) {

        if (value != null && !value.isBlank()) {
            criteriaList.add(
                    Criteria.where(field)
                            .regex(value, "i"));
        }
    }

}
