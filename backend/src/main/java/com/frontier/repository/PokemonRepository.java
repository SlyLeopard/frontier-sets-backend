package com.frontier.repository;

// Imports
import org.springframework.stereotype.Repository;
import com.frontier.model.Pokemon;
import com.frontier.repository.base.BaseRepository;

// Annotations
@Repository

// Class
public interface PokemonRepository extends BaseRepository<Pokemon> {

    // Methods
    public Pokemon findByDex(Integer dex);

}
