package com.frontier.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.frontier.enums.Nature;
import com.frontier.model.CustomSet;

import lombok.Data;

@Data
@JsonPropertyOrder({
    "name",
    "species",
    "nature",
    "item",
    "moves",
    "ev",
    "iv",
})
public class CustomSetDTO {

    private String name;
    private String species;
    private Integer[] ev;
    private Integer[] iv;
    private List<String> moves;
    private Nature nature;
    private String item;

    public static CustomSetDTO fromEntity(CustomSet set) {
        CustomSetDTO dto = new CustomSetDTO();
        dto.setName(set.getName());
        dto.setSpecies(set.getSpecies());
        dto.setNature(set.getNature());
        dto.setItem(set.getItem());
        dto.setEv(set.getEv());
        dto.setIv(set.getIv());
        dto.setMoves(set.getMoves());
        return dto;
    }
    
}
