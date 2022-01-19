package com.refactoring.smells.couplers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KDATest {
    @Test
    public void shouldReturnKills() {
        Score score = new Score();
        KDA kda = new KDA(10, 20, 30, score);
        assertEquals(10, kda.getKills());
    }
    @Test
    public void shouldReturnDeaths() {
        Score score = new Score();
        KDA kda = new KDA(10, 20, 30, score);
        assertEquals(20, kda.getDeaths());
    }
    @Test
    public void shouldReturnAssists() {
        Score score = new Score();
        KDA kda = new KDA(10, 20, 30, score);
        assertEquals(30, kda.getAssists());
    }
    @Test
    public void shouldReturnTotalScore(){
        Score score = new Score();
        score.setKillFactor(10);
        score.setDeathFactor(5);
        KDA kda = new KDA(10, 20, 30, score);
        assertEquals(30, kda.getTotalScore());
    }


}