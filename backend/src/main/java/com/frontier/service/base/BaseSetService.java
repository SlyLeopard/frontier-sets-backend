package com.frontier.service.base;

import java.util.function.Function;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.frontier.model.base.AbstractSet;
import com.frontier.repository.base.BaseRepository;
import com.frontier.search.base.BaseSetSearchCriteria;

@Service
public abstract class BaseSetService<T extends AbstractSet, R extends BaseRepository<T>, C extends BaseSetSearchCriteria, D> extends BaseService<T, R, C, D> {

    protected final R repo;
    protected final MongoTemplate mongoTemplate;
    protected final Function<T, D> mapper;

    protected BaseSetService(R repo, MongoTemplate mongoTemplate, Class<T> entityClass, Function<T, D> mapper) {
        super(repo, mongoTemplate, entityClass, mapper);
        this.repo = repo;
        this.mongoTemplate = mongoTemplate;
        this.mapper = mapper;
    }

    public T save(T set) {
        validateSet(set);
        return repo.save(set);
    }

    protected void validateSet(T set) {

        if (set.getMoves() != null && set.getMoves().size() > 4) {
            throw new IllegalArgumentException("A set cannot have more than 4 moves");
        }

    }

}
