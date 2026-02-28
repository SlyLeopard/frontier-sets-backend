package com.frontier.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Document(collection = "trainer")
@AllArgsConstructor
public class Trainer {

    @Id
    @Getter
    private String id;

    @Getter
    @Setter
    private String index;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String trainerClass;

    @Getter
    @Setter
    private int rank;
    
}
