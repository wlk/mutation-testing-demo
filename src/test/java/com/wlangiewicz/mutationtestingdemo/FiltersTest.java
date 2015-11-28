package com.wlangiewicz.mutationtestingdemo;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/*
 Uncommented tests have a 100% line and mutation coverage
 One mutant will survive
 Example of CONDITIONALS_BOUNDARY_MUTATOR
 Problem with PIT: doesn't mutate collection contents - note that we are not asserting it in the tests
 */
public class FiltersTest {

    @Test
    public void elements_below_10_should_be_kept() {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6);

        Stream<Integer> output = Filters.filterList(numbers);

        long elements = output.count();

        assertEquals(6, elements);
    }

    @Test
    public void elements_above_10_should_be_removed() {
        Stream<Integer> numbers = Stream.of(11, 14);

        Stream<Integer> output = Filters.filterList(numbers);

        long elements = output.count();

        assertEquals(0, elements);
    }

    // Uncomment this test to see all mutants killed
    /*
    @Test
    public void elements_equal_to_10_should_be_kept() {
        Stream<Integer> numbers = Stream.of(10, 10);

        Stream<Integer> output = Filters.filterList(numbers);

        long elements = output.count();

        assertEquals(2, elements);
    }*/
}
