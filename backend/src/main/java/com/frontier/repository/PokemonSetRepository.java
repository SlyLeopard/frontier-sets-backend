package com.frontier.repository;

import java.util.List;

// Imports
import org.springframework.stereotype.Repository;
import com.frontier.model.PokemonSet;
import com.frontier.repository.base.BaseSetRepository;

// Annotations
@Repository

// Class
public interface PokemonSetRepository extends BaseSetRepository<PokemonSet> {

    public List<PokemonSet> findByRank(Integer rank);

    public List<PokemonSet> findByGeneration(Integer generation);

}
