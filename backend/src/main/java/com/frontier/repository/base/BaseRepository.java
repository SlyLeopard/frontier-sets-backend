package com.frontier.repository.base;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.frontier.model.base.BaseEntity;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity> extends MongoRepository<T, String> {

    public Optional<T> findById(String id);

    public Optional<T> findByName(String name);

    public List<T> findAll();
    
}
