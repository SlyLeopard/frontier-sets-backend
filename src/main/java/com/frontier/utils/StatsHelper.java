package com.frontier.utils;

import java.util.Arrays;

import com.frontier.enums.Nature;

public class StatsHelper {

    private static final Integer[] ivConversionDefault = { 3, 6, 9, 12, 15, 18, 21, 31 };

    private static final Integer[] ivConversionFactory = { 0, 4, 8, 12, 16, 20, 24, 31 };

    public static Integer[] getIvs(Integer rank, Boolean isFactory) {
        Integer[] ivs = { 1, 1, 1, 1, 1, 1 };
        if (isFactory) {
            return Arrays.stream(ivs).map(x -> x * StatsHelper.ivConversionFactory[rank - 1]).toArray(Integer[]::new);
        } else {
            return Arrays.stream(ivs).map(x -> x * StatsHelper.ivConversionDefault[rank - 1]).toArray(Integer[]::new);
        }
    }

    public static Integer[] getStats(Integer[] baseStats, Integer[] ev, Integer[] iv, Nature nature) {
        Integer[] ivs = { 1, 1, 1, 1, 1, 1 };
        return ivs;
    }

}