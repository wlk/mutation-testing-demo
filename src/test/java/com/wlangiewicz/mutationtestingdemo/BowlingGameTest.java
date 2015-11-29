package com.wlangiewicz.mutationtestingdemo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
 Implementation of the Bowling Game Kata (tests) by Uncle Bob

 All tests pass, no mutants survive (with default mutators)

 I have moved 'rollStrike', 'rollSpare', 'rollMany' into BowlingGame class,
 after that mutant with CONDITIONALS_BOUNDARY_MUTATOR started to survive

 */
@SuppressWarnings("Duplicates")
public class BowlingGameTest {
    private BowlingGame g;

    @Before
    public void setUp() throws Exception {
        g = new BowlingGame();
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

}
