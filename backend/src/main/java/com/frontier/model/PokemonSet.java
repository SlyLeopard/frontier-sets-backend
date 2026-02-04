package com.frontier.model;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class PokemonSet {

    @Getter
    @Setter
    private int dex;
    
    @Getter
    @Setter
    private int hpEv;

    @Getter
    @Setter
    private int atkEv;

    @Getter
    @Setter
    private int defEv;

    @Getter
    @Setter
    private int spaEv;

    @Getter
    @Setter
    private int spdEv;

    @Getter
    @Setter
    private int speEv;

    @Getter
    @Setter
    private ArrayList<String> moves;

    @Getter
    @Setter
    private String nature;

    @Getter
    @Setter
    private String item;
    
}
