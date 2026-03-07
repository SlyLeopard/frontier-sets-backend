package com.frontier.enums;

public enum Stat {

    HP(0),
    ATK(1),
    DEF(2),
    SPA(3),
    SPD(4),
    SPE(5);

    private final int index;

    Stat(int index) {
        this.index = index;
    }

    public int index() {
        return index;
    }
}
