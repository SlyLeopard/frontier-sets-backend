package com.frontier.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

@Data
@NoArgsConstructor
@Document(collection = "pokemon")
public class Pokemon {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private int dex;

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
    private ArrayList<String> types;

    @Getter
    @Setter
    private ArrayList<String> abilities;
}
