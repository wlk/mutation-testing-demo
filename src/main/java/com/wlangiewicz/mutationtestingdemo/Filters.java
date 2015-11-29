package com.wlangiewicz.mutationtestingdemo;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Filters {
    public static Predicate<Integer> isLessThenOrEqual10() {
        return n -> n <= 10;
    }

    public static Stream<Integer> filterStream(Stream<Integer> s) {
        return s.filter(isLessThenOrEqual10());
    }

}
