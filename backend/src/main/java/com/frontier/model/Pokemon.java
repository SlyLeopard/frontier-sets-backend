package com.frontier.model;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Pokemon {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private int number;

    @Getter
    @Setter
    private int hp;

    @Getter
    @Setter
    private int atk;

    @Getter
    @Setter
    private int def;

    @Getter
    @Setter
    private int spa;

    @Getter
    @Setter
    private int spd;

    @Getter
    @Setter
    private int spe;

    @Getter
    @Setter
    private int group;

    @Getter
    @Setter
    private ArrayList<String> moves;
}
