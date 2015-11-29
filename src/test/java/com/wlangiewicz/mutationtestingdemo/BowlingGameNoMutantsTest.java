package com.wlangiewicz.mutationtestingdemo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
 Implementation of the Bowling Game Kata (tests) by Uncle Bob with fixes to kill all mutants
 All tests pass, no mutants survive
 */
@SuppressWarnings("Duplicates")
public class BowlingGameNoMutantsTest {
    private BowlingGameNoMutants g;

    @Before
    public void setUp() throws Exception {
        g = new BowlingGameNoMutants();
    }

    @Test
    public void testAllOnes() throws Exception {
        g.rollMany(20, 1);
        assertEquals(20, g.score());
    }

    @Test
    public void testOneSpare() throws Exception {
        g.rollSpare();
        g.roll(3);
        g.rollMany(17, 0);
        assertEquals(16, g.score());
    }

    @Test
    public void testOneStrike() throws Exception {
        g.rollStrike();
        g.roll(3);
        g.roll(4);
        g.rollMany(16, 0);
        assertEquals(24, g.score());
    }

    @Test
    public void testPerfectGame() throws Exception {
        g.rollMany(12, 10);
        assertEquals(300, g.score());
    }

    // This test kills mutant in `isSpare` method
    @Test
    public void testRoll5AndOtherMisses() throws Exception {
        g.roll(5);
        g.rollMany(19, 0);
        assertEquals(5, g.score());
    }

    // This test kills mutant "BowlingGame with 20 rolls"
    @Test
    public void testMaxRollsGame() throws Exception {
        g.rollMany(19, 0);
        g.rollStrike();
        g.roll(5);
        assertEquals(15, g.score());
    }

    // This test kills mutant "BowlingGame with over 21 rolls"
    @Test
    public void testMaxRolls() throws Exception {
        assertEquals(21, BowlingGameNoMutants.MAX_ROLLS);
    }
}
