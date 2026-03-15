package com.frontier.model.base;

import java.util.List;

import com.frontier.enums.Nature;
import com.frontier.enums.Stat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractSet extends BaseEntity {

    private String species;
    private int[] ev;
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
