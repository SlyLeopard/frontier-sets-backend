package com.frontier.model.dto;

import java.util.List;

import com.frontier.enums.Nature;

import lombok.Data;

@Data
public class CustomSetDTO {

    private String name;
    private String species;
    private Integer[] ev;
    private Integer[] iv;
    private List<String> moves;
    private Nature nature;
    private String item;
    
}
