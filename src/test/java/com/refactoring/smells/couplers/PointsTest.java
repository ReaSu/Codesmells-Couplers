package com.refactoring.smells.couplers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointsTest {
    @Test
    void shouldReturnWins() {
        Score score = new Score();
        Points points = new Points(score);
        points.setWins(50);
        points.setLosses(23);
        assertEquals(50, points.getWins());
    }

    @Test
    void shouldReturnLosses() {
        Score score = new Score();
        Points points = new Points(score);
        points.setWins(50);
        points.setLosses(23);
        assertEquals(23, points.getLosses());
    }

    @Test
    void shouldReturnTotal() {
        Score score = new Score();
        Points points = new Points(score);
        points.setWins(50);
        points.setLosses(23);
        assertEquals(50-23, points.getTotal());
    }

    @Test
    public void shouldReturnTotalScore() {
        Score score = new Score();
        Points points = new Points(score);
        points.setWins(50);
        points.setLosses(23);
        assertEquals("Good", points.score.getRating());
    }
}