package com.frontier.enums;

public enum Nature {

    HARDY(null, null),
    LONELY(Stat.ATK, Stat.DEF),
    BRAVE(Stat.ATK, Stat.SPE),
    ADAMANT(Stat.ATK, Stat.SPA),
    NAUGHTY(Stat.ATK, Stat.SPD),

    BOLD(Stat.DEF, Stat.ATK),
    DOCILE(null, null),
    RELAXED(Stat.DEF, Stat.SPE),
    IMPISH(Stat.DEF, Stat.SPA),
    LAX(Stat.DEF, Stat.SPD),

    TIMID(Stat.SPE, Stat.ATK),
    HASTY(Stat.SPE, Stat.DEF),
    SERIOUS(null, null),
    JOLLY(Stat.SPE, Stat.SPA),
    NAIVE(Stat.SPE, Stat.SPD),

    MODEST(Stat.SPA, Stat.ATK),
    MILD(Stat.SPA, Stat.DEF),
    QUIET(Stat.SPA, Stat.SPE),
    BASHFUL(null, null),
    RASH(Stat.SPA, Stat.SPD),

    CALM(Stat.SPD, Stat.ATK),
    GENTLE(Stat.SPD, Stat.DEF),
    SASSY(Stat.SPD, Stat.SPE),
    CAREFUL(Stat.SPD, Stat.SPA),
    QUIRKY(null, null);

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
