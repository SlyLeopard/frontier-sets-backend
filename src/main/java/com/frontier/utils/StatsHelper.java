package com.frontier.utils;

import java.util.Arrays;

import com.frontier.enums.Nature;
import com.frontier.enums.Stat;

public class StatsHelper {

    private static final Integer[] ivConversionDefault = { 3, 6, 9, 12, 15, 18, 21, 31 };

    private static final Integer[] ivConversionFactory = { 0, 4, 8, 12, 16, 20, 24, 31 };

    private static final Stat[] stats = {Stat.HP, Stat.ATK, Stat.DEF, Stat.SPA, Stat.SPD, Stat.SPE};

    public static Integer[] getIvs(Integer rank, Boolean isFactory) {
        Integer[] ivs = { 1, 1, 1, 1, 1, 1 };
        if (isFactory) {
            return Arrays.stream(ivs).map(x -> x * StatsHelper.ivConversionFactory[rank - 1]).toArray(Integer[]::new);
        } else {
            return Arrays.stream(ivs).map(x -> x * StatsHelper.ivConversionDefault[rank - 1]).toArray(Integer[]::new);
        }
    }

    public static Integer[] getStats(Integer[] baseStats, Integer[] ev, Integer[] iv, Nature nature) {
        Integer[] results = new Integer[6];
        results[0] = calculateHP(baseStats[0], iv[0], ev[0]);
        for(int i=1; i<6; i++) {
            results[i] = calculateStat(baseStats[i], iv[i], ev[i], nature, stats[i]);
        }
        return results;
    }

    public static Integer calculateHP(Integer baseHP, Integer iv, Integer ev) {
        return Math.floorDiv(50 * (2 * baseHP + iv + Math.floorDiv(ev, 4)), 100) + 60;
    }

    public static Integer calculateStat(Integer base, Integer iv, Integer ev, Nature nature, Stat stat) {
        return (int) Math.floor((Math.floorDiv((2 * base + iv + Math.floorDiv(ev, 4)) * 50, 100) + 5) * nature.getModifier(stat));
    }

}