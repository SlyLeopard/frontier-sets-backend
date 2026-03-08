package com.frontier.enums;

public enum Nature {

    

    
    ADAMANT(Stat.ATK, Stat.SPA),
    LONELY(Stat.ATK, Stat.DEF),

    MODEST(Stat.SPA, Stat.ATK),

    SERIOUS(null, null),

    JOLLY(Stat.SPE, Stat.SPA),
    TIMID(Stat.SPE, Stat.ATK);

    private final Stat boost;
    private final Stat drop;

    Nature(Stat boost, Stat drop) {
        this.boost = boost;
        this.drop = drop;
    }

    public Stat getBoost() {
        return boost;
    }

    public Stat getDrop() {
        return drop;
    }
}
