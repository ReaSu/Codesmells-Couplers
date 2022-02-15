package com.refactoring.smells.couplers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreTest {

    @Test
    void shouldReturnRating() {
        Score score = new Score();
        score.setWins(10);
        score.setLosses(2);
        assertEquals("Bad", score.getRating());
    }

    @Test
    void shouldReturnWins() {
        Score score = new Score();
        score.setWins(50);
        score.setLosses(23);
        assertEquals(50, score.getWins());
    }

    @Test
    void shouldReturnLosses() {
        Score score = new Score();
        score.setWins(50);
        score.setLosses(23);
        assertEquals(23, score.getLosses());
    }

    @Test
    void shouldReturnTotal() {
        Score score = new Score();
        score.setWins(50);
        score.setLosses(23);
        assertEquals(50-23, score.getTotal());
    }

    @Test
    public void shouldReturnTotalScore() {
        Score score = new Score();
        score.setWins(50);
        score.setLosses(23);
        assertEquals("Good", score.getRating());
    }
}