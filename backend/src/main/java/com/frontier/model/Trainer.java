package com.frontier.model;

// Imports
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

// Annotations
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "trainer")

// Class
public class Trainer {

    // Attributes
    @Id
    private String id;
    private String name;
    private String trainerClass;
    private Integer rank;

}
