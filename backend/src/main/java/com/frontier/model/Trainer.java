package com.frontier.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Document(collection = "trainers")
@AllArgsConstructor
public class Trainer {

    @Id
    private String id;

    private Integer index;
    private String name;
    private String trainerClass;
    private Integer rank;
    
}
