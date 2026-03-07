package com.frontier.model;

// Imports
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

// Annotations
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "pokemonSet")

// Class
public class PokemonSet extends Set {

    // Attributes
    private Integer rank;
    private Integer generation;
    
}
