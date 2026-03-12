package com.frontier.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.frontier.enums.Nature;
import com.frontier.model.PokemonSet;

import lombok.Data;

@Data
@JsonPropertyOrder({
    "name",
    "species",
    "nature",
    "item",
    "moves",
    "ev",
    "rank",
    "generation"
})
public class PokemonSetDTO {

    private String name;
    private String species;
    private Integer[] ev;
    private List<String> moves;
    private Nature nature;
    private String item;
    private Integer rank;
    private Integer generation;

    public static PokemonSetDTO fromEntity(PokemonSet set) {
        PokemonSetDTO dto = new PokemonSetDTO();
        dto.setName(set.getName());
        dto.setSpecies(set.getSpecies());
        dto.setNature(set.getNature());
        dto.setItem(set.getItem());
        dto.setEv(set.getEv());
        dto.setMoves(set.getMoves());
        dto.setRank(set.getRank());
        dto.setGeneration(set.getGeneration());
        return dto;
    }

}
