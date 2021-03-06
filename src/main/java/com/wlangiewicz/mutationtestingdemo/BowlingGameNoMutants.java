package com.wlangiewicz.mutationtestingdemo;

/*
 Implementation of the Bowling Game Kata by Uncle Bob with fix that allows to kill all mutants
 */
@SuppressWarnings("Duplicates")
public class BowlingGameNoMutants {
    public static int MAX_ROLLS = 21;
    private int rolls[] = new int[MAX_ROLLS];
    private int currentRoll;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(frameIndex)) {
                score += 10 + strikeBonus(frameIndex);
                frameIndex++;
            } else if (isSpare(frameIndex)) {
                score += 10 + spareBonus(frameIndex);
                frameIndex += 2;
            } else {
                score += sumOfBallsInFrame(frameIndex);
                frameIndex += 2;
            }
        }
        return score;
    }

    public void rollStrike() {
        roll(10);
    }

    public void rollSpare() {
        roll(5);
        roll(5);
    }

    public void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            roll(pins);
    }

    private boolean isStrike(int frameIndex) {
        return rolls[frameIndex] == 10;
    }

    private int sumOfBallsInFrame(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1];
    }

    private int spareBonus(int frameIndex) {
        return rolls[frameIndex + 2];
    }

    private int strikeBonus(int frameIndex) {
        return rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

    private boolean isSpare(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
    }
}