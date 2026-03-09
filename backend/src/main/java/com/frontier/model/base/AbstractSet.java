package com.frontier.model.base;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.frontier.enums.Nature;
import com.frontier.enums.Stat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractSet {

    @Id
    private String id;

    private String name;
    private String species;
    private Integer[] ev;
    private List<String> moves;
    private Nature nature;
    private String item;

    public int getEV(Stat stat) {
        return ev[stat.index()];
    }

    public void setEV(Stat stat, int value) {
        ev[stat.index()] = value;
    }

}
