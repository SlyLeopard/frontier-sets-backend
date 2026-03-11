package com.frontier.service.base;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Service;

import com.frontier.model.base.BaseEntity;
import com.frontier.repository.base.BaseRepository;
import com.frontier.search.base.BaseSearchCriteria;

@Service
public abstract class BaseService<T extends BaseEntity, R extends BaseRepository<T>, C extends BaseSearchCriteria, D> {

    protected final R repo;
    protected final MongoTemplate mongoTemplate;
    private final Class<T> entityClass;

    protected BaseService(R repo, MongoTemplate mongoTemplate, Class<T> entityClass) {
        this.repo = repo;
        this.mongoTemplate = mongoTemplate;
        this.entityClass = entityClass;
    }

    public List<T> getAll() {
        return repo.findAll();
    }

    public Optional<T> getById(String id) {
        return repo.findById(id);
    }

    public void delete(String id) {
        repo.deleteById(id);
    }

    public T save(T set) {
        return repo.save(set);
    }

    public Optional<T> getByName(String name) {
        return repo.findByName(name);
    }

    public Page<T> search(C criteria) {

        Query query = criteria.toQuery();
        Pageable pageable = criteria.toPageable();
        query.with(pageable);
        List<T> results = mongoTemplate.find(query, entityClass);

        return PageableExecutionUtils.getPage(
                results,
                pageable,
                () -> mongoTemplate.count(query.skip(0).limit(0), entityClass));

    }

    protected abstract D toDTO(T entity);

}
