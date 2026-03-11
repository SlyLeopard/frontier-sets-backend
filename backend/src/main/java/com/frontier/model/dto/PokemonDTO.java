package com.frontier.model.dto;

import java.util.List;

import com.frontier.enums.PokemonType;

import lombok.Data;

@Data
public class PokemonDTO {
    
    private String name;
    private Integer dex;
    private Integer[] stats;
    private List<PokemonType> type;
    private List<String> abilities;

}
