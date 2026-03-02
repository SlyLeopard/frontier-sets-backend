package com.frontier.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Document(collection = "trainer")
@AllArgsConstructor
public class Trainer {

    @Id
    private String id;

    private String name;
    private String trainerClass;
    private Integer rank;
    
}
