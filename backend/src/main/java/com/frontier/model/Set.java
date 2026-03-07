package com.frontier.model;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Set {
    
    @Id
    private String id;

    private String name;
    private String species;
    private List<Integer> ev;
    private List<String> moves;
    private String nature;
    private String item;

}
