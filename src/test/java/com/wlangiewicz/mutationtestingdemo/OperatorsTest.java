package com.wlangiewicz.mutationtestingdemo;

import org.junit.Test;
import static org.junit.Assert.*;

public class OperatorsTest {

    @Test
    public void testBoth0() {
        boolean result = Operators.and(0, 0);
        assertFalse(result);
    }

    @Test
    public void testFirst0() {
        boolean result = Operators.and(0, 1);
        assertFalse(result);
    }

    @Test
    public void testSecond0() {
        boolean result = Operators.and(1, 0);
        assertFalse(result);
    }

    @Test
    public void testBoth1() {
        boolean result = Operators.and(1, 1);
        assertTrue(result);
    }
}
