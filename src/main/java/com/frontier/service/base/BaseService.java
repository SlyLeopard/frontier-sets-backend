package com.frontier.service.base;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

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
    private final Function<T, D> mapper;

    protected BaseService(R repo, MongoTemplate mongoTemplate, Class<T> entityClass, Function<T, D> mapper) {
        this.repo = repo;
        this.mongoTemplate = mongoTemplate;
        this.entityClass = entityClass;
        this.mapper = mapper;
    }

    public Page<D> getAll(Pageable pageable) {
        return repo.findAll(pageable).map(mapper);
    }

    public Optional<D> getById(String id) {
        return repo.findById(id).map(mapper);
    }

    public void delete(String id) {
        repo.deleteById(id);
    }

    public T save(T set) {
        return repo.save(set);
    }

    public Optional<D> getByName(String name) {
        return repo.findByName(name).map(mapper);
    }

    public Page<D> search(C criteria, Pageable pageable) {

        Query query = criteria.toQuery();
        query.with(pageable);

        List<D> results = mongoTemplate
                .find(query, entityClass)
                .stream()
                .map(mapper)
                .toList();

        return PageableExecutionUtils.getPage(
                results,
                pageable,
                () -> mongoTemplate.count(query.skip(0).limit(0), entityClass));

    }

}
