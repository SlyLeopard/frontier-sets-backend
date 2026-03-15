package com.frontier.utils;

import java.util.Arrays;

import com.frontier.enums.Nature;
import com.frontier.enums.Stat;

public class StatsHelper {

    private static final int STAT_COUNT = 6;

    private static final int[] IV_CONVERSION_DEFAULT = { 3, 6, 9, 12, 15, 18, 21, 31 };

    private static final int[] IV_CONVERSION_FACTORY = { 0, 4, 8, 12, 16, 20, 24, 31 };

    private static final Stat[] STATS = { Stat.HP, Stat.ATK, Stat.DEF, Stat.SPA, Stat.SPD, Stat.SPE };

    private StatsHelper() {
        throw new UnsupportedOperationException("Utility Class");
    }

    public static int[] getIvs(int rank, boolean isFactory) {

        if (rank < 1 || rank > IV_CONVERSION_DEFAULT.length) {
            throw new IllegalArgumentException("Rank must be between 1 and 8");
        }

        int value = isFactory
                ? IV_CONVERSION_FACTORY[rank - 1]
                : IV_CONVERSION_DEFAULT[rank - 1];

        int[] ivs = new int[STAT_COUNT];
        Arrays.fill(ivs, value);
        return ivs;
    }

    public static int[] getStats(int[] baseStats, int[] ev, int[] iv, Nature nature) {
        int[] results = new int[STAT_COUNT];

        results[0] = calculateHP(baseStats[0], iv[0], ev[0]);

        for (int i = 1; i < STAT_COUNT; i++) {
            results[i] = calculateStat(baseStats[i], iv[i], ev[i], nature, STATS[i]);
        }

        return results;
    }

    public static int calculateHP(int baseHP, int iv, int ev) {
        return Math.floorDiv(50 * (2 * baseHP + iv + Math.floorDiv(ev, 4)), 100) + 60;
    }

    public static int calculateStat(int base, int iv, int ev, Nature nature, Stat stat) {
        return (int) Math.floor(
                (Math.floorDiv((2 * base + iv + Math.floorDiv(ev, 4)) * 50, 100) + 5) * nature.getModifier(stat));
    }

}