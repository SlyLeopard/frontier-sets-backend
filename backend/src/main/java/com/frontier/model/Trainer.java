package com.frontier.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Document
public class Trainer {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private int group;
    
}
