package com.frontier.repository.base;

import java.util.List;
import org.springframework.data.repository.NoRepositoryBean;

import com.frontier.model.base.AbstractSet;

@NoRepositoryBean
public interface BaseSetRepository<T extends AbstractSet>
        extends BaseRepository<T> {

    public List<T> findBySpecies(String species);
}