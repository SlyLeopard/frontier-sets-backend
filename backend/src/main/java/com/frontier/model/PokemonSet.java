package com.frontier.model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.frontier.model.base.AbstractSet;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "pokemonSet")
public class PokemonSet extends AbstractSet {

    private Integer rank;
    private Integer generation;

}
