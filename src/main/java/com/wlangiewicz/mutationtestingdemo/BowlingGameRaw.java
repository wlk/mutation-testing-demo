package com.wlangiewicz.mutationtestingdemo;

/*
 Implementation of the Bowling Game Kata by Uncle Bob
 */
@SuppressWarnings("Duplicates")
public class BowlingGameRaw {
    // size of the game is not tested, you can change it to 20 or 22 (or more) and all tests will pass
    // 21 is the maximum number of rolls in bowling, but this wasn't tested as well
    private int rolls[] = new int[21];
    private int currentRoll = 0; // remove assignment to kill one non default mutant

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

    // There is no test to check `isSpare` logic
    private boolean isSpare(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
    }
}