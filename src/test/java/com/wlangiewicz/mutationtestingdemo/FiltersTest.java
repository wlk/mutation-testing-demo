package com.wlangiewicz.mutationtestingdemo;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FiltersTest {

    @Test
    public void elements_below_10_should_be_kept() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        List<Integer> output = Filters.filterList(numbers);

        long elements = output.size();

        assertEquals(6, elements);
    }

    @Test
    public void elements_above_10_should_be_removed() {
        List<Integer> numbers = Arrays.asList(11, 12, 13);

        List<Integer> output = Filters.filterList(numbers);

        long elements = output.size();

        assertEquals(0, elements);
    }

    // Uncomment this test to see all mutants killed
    /*@Test
    public void elements_equal_to_10_should_be_kept() {
        List<Integer> numbers = Arrays.asList(10, 10);

        List<Integer> output = Filters.filterList(numbers);

        long elements = output.size();

        assertEquals(2, elements);
    }*/
}
