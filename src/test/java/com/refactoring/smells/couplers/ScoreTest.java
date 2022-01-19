package com.refactoring.smells.couplers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreTest {

    @Test
    void shouldReturnRating() {
        Score score = new Score();
        Points points = new Points(score);
        points.setWins(10);
        points.setLosses(2);
        assertEquals("Bad", score.getRating());
    }
}