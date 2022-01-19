package com.refactoring.smells.couplers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreTest {

    @Test
    void shouldCalculateTotalScore() {
        Score score = new Score();
        KDA kda = new KDA(10, 10, 10, score);
        int result = score.totalScore();
        assertEquals(-20, result);
    }
}