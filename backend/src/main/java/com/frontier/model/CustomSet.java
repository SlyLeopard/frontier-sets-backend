package com.frontier.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.frontier.enums.Stat;
import com.frontier.model.base.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "customSet")
public class CustomSet extends Set {

    // Attributes
    private Integer[] iv;

    public int getIV(Stat stat) {
        return iv[stat.index()];
    }

    public void setIV(Stat stat, int value) {
        iv[stat.index()] = value;
    }

}
