package com.wlangiewicz.mutationtestingdemo;

import org.junit.Test;

import static org.junit.Assert.*;

/*
 Uncommented tests have a 100% line coverage
 But mutation coverage is only 14%
 Example of VOID_METHOD_CALL_MUTATOR
 */
public class CounterTest {

    @Test
    public void test_setup() {
        Counter c = new Counter();
        assertEquals(0, c.getCount());
    }

    @Test
    public void test_make5increments_and_reset() {
        Counter c = new Counter();
        c.make5Increments(); //someone was sloppy here and just executed method to increase code coverage but didn't assert this condition
        c.reset();
        assertEquals(0, c.getCount());
    }

    // Uncommenting this test increases mutation coverage to 29%
    /*@Test
    public void test_increment_and_reset() {
        Counter c = new Counter();
        c.increment();
        assertEquals(1, c.getCount());
    }*/

    // Uncommenting this test increases mutation coverage to 100%
    /*@Test
    public void test_make5increments() {
        Counter c = new Counter();
        c.make5Increments();
        assertEquals(5, c.getCount());
    }*/

}
