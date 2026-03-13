package com.frontier.enums;

public enum Nature {

    Hardy(null, null),
    Lonely(Stat.ATK, Stat.DEF),
    Brave(Stat.ATK, Stat.SPE),
    Adamant(Stat.ATK, Stat.SPA),
    Naughty(Stat.ATK, Stat.SPD),

    Bold(Stat.DEF, Stat.ATK),
    Docile(null, null),
    Relaxed(Stat.DEF, Stat.SPE),
    Impish(Stat.DEF, Stat.SPA),
    Lax(Stat.DEF, Stat.SPD),

    Timid(Stat.SPE, Stat.ATK),
    Hasty(Stat.SPE, Stat.DEF),
    Serious(null, null),
    Jolly(Stat.SPE, Stat.SPA),
    Naive(Stat.SPE, Stat.SPD),

    Modest(Stat.SPA, Stat.ATK),
    Mild(Stat.SPA, Stat.DEF),
    Quiet(Stat.SPA, Stat.SPE),
    Bashful(null, null),
    Rash(Stat.SPA, Stat.SPD),

    Calm(Stat.SPD, Stat.ATK),
    Gentle(Stat.SPD, Stat.DEF),
    Sassy(Stat.SPD, Stat.SPE),
    Careful(Stat.SPD, Stat.SPA),
    Quirky(null, null);

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

    public Double getModifier(Stat stat) {
        if(stat == this.boost) {
            return 1.1;
        } else if(stat == this.drop) {
            return 0.9;
        } else return 1.0;
    }
}
