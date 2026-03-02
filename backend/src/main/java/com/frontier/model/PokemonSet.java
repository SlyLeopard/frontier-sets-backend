package com.frontier.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@Document(collection = "pokemonSet")
@NoArgsConstructor
public class PokemonSet {

    @Id
    private String id;
    
    private Pokemon pokemon;
    private int dex;
    private int hpEv;
    private int atkEv;
    private int defEv;
    private int spaEv;
    private int spdEv;
    private int speEv;
    private ArrayList<String> moves;
    private String nature;
    private String item;
    
}
