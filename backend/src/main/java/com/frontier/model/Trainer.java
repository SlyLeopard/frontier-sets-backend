package com.frontier.model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.frontier.model.base.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "trainer")
public class Trainer extends BaseEntity {

    private String trainerClass;
    private Integer rank;

}
