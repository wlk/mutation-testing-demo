package com.wlangiewicz.mutationtestingdemo;

import java.util.List;
import java.util.stream.Collectors;

public class Filters {
    public static boolean isLessThenOrEqual10(Integer n) {
        return n <= 10;
    }

    public static List<Integer> filterList(List<Integer> list) {
        return list.stream().filter(Filters::isLessThenOrEqual10).collect(Collectors.toList());
    }

}
