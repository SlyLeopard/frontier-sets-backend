package com.frontier.repository;

import org.springframework.stereotype.Repository;

import com.frontier.model.Pokemon;
import com.frontier.repository.base.BaseRepository;

@Repository
public interface PokemonRepository extends BaseRepository<Pokemon> {

    public Pokemon findByDex(Integer dex);

}
