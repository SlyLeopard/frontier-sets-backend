package com.frontier.service.base;


import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import com.frontier.model.base.AbstractSet;
import com.frontier.repository.base.BaseRepository;
import com.frontier.search.base.BaseSetSearchCriteria;

@Service
public abstract class BaseSetService<T extends AbstractSet, R extends BaseRepository<T>, C extends BaseSetSearchCriteria> extends BaseService<T, R, C> {

    protected final R repo;
    protected final MongoTemplate mongoTemplate;
    protected BaseSetService(R repo, MongoTemplate mongoTemplate, Class<T> entityClass) {
        super(repo, mongoTemplate, entityClass);
        this.repo = repo;
        this.mongoTemplate = mongoTemplate;
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
