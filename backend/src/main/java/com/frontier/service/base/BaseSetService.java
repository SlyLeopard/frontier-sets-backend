package com.frontier.service.base;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.frontier.model.base.AbstractSet;

public abstract class BaseSetService<T extends AbstractSet, R extends MongoRepository<T, String>> {

    protected final R repo;

    protected BaseSetService(R repo) {
        this.repo = repo;
    }

    public List<T> getAll() {
        return repo.findAll();
    }

    public Optional<T> getById(String id) {
        return repo.findById(id);
    }

    public T save(T set) {
        validateSet(set);
        return repo.save(set);
    }

    public void delete(String id) {
        repo.deleteById(id);
    }

    protected void validateSet(T set) {

        if (set.getMoves() != null && set.getMoves().size() > 4) {
            throw new IllegalArgumentException("A set cannot have more than 4 moves");
        }

    }

}
