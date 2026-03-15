package com.frontier.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.frontier.enums.PokemonType;
import com.frontier.model.Pokemon;

import lombok.Data;

@Data
@JsonPropertyOrder({
    "name",
    "dex",
    "type",
    "abilities",
    "stats",
})
public class PokemonDTO {
    
    private String name;
    private int dex;
    private int[] stats;
    private List<PokemonType> type;
    private List<String> abilities;

    public static PokemonDTO fromEntity(Pokemon pokemon) {
        PokemonDTO dto = new PokemonDTO();
        dto.setName(pokemon.getName());
        dto.setDex(pokemon.getDex());
        dto.setStats(pokemon.getStats());
        dto.setAbilities(pokemon.getAbilities());
        dto.setType(pokemon.getType());
        return dto;
    }

}
