package com.frontier.model.dto;

import java.util.List;

import com.frontier.enums.Nature;
import com.frontier.model.PokemonSet;

import lombok.Data;

@Data
public class CombinedPokemonSetDTO {
    
    private String name;
    private String species;
    private PokemonDTO pokemon;
    private Integer[] ev;
    private List<String> moves;
    private Nature nature;
    private String item;
    private Integer rank;
    private Integer generation;

    public static CombinedPokemonSetDTO fromEntity(PokemonSet set, PokemonDTO pokemon) {
        CombinedPokemonSetDTO dto = new CombinedPokemonSetDTO();
        dto.setName(set.getName());
        dto.setSpecies(set.getSpecies());
        dto.setPokemon(pokemon);
        dto.setNature(set.getNature());
        dto.setItem(set.getItem());
        dto.setEv(set.getEv());
        dto.setMoves(set.getMoves());
        dto.setRank(set.getRank());
        dto.setGeneration(set.getGeneration());
        return dto;
    }

}
