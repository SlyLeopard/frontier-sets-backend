package com.frontier.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.frontier.enums.Nature;
import com.frontier.model.PokemonSet;
import com.frontier.utils.StatsHelper;

import lombok.Data;

@Data
@JsonPropertyOrder({
    "name",
    "species",
    "pokemon",
    "nature",
    "item",
    "moves",
    "ev",
    "ivDefault",
    "ivFactory",
    "finalStatsDefault",
    "finalStatsFactory",
    "rank",
    "generation"
})
public class CombinedPokemonSetDTO {
    
    private String name;
    private String species;
    private PokemonDTO pokemon;
    private Integer[] ev;
    private Integer[] ivDefault;
    private Integer[] ivFactory;
    private Integer[] finalStatsDefault;
    private Integer[] finalStatsFactory;
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
        dto.setIvDefault(StatsHelper.getIvs(set.getRank(), false));
        dto.setIvFactory(StatsHelper.getIvs(set.getRank(), true));
        dto.setFinalStatsDefault(StatsHelper.getStats(dto.getPokemon().getStats(), dto.getEv(), dto.getIvDefault(), dto.getNature()));
        dto.setFinalStatsFactory(StatsHelper.getStats(dto.getPokemon().getStats(), dto.getEv(), dto.getIvFactory(), dto.getNature()));
        dto.setMoves(set.getMoves());
        dto.setRank(set.getRank());
        dto.setGeneration(set.getGeneration());
        return dto;
    }

}
