package com.refactoring.smells.couplers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void shouldSetUpCorrectly() {
        Score score = new Score();
        KDA kda = new KDA(10, 10, 10, score);
        Player player = new Player("Elvira", kda);
        assertEquals(player.getName(), "Elvira");
        assertNotNull(player.getKda());
    }

}