package com.frontier.model;

// Imports
import org.springframework.data.mongodb.core.mapping.Document;
import com.frontier.model.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

// Annotations
@Data
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "trainer")

// Class
public class Trainer extends BaseEntity {

    // Attributes
    private String trainerClass;
    private Integer rank;

}
