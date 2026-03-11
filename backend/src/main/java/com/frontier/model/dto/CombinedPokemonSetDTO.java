package com.frontier.model.dto;

import java.util.List;

import com.frontier.enums.Nature;
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

}
