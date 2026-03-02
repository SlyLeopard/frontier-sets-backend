package com.frontier.model;

// Imports
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import java.util.ArrayList;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

// Annotations
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "pokemon")

// Class
public class Pokemon {

    // Attributes
    @Id
    private String id;
    private String name;
    private int dex;
    private int hp;
    private int atk;
    private int def;
    private int spa;
    private int spd;
    private int spe;
    private ArrayList<String> types;
    private ArrayList<String> abilities;
    
}
