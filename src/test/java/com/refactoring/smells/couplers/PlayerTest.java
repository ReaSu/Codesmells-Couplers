package com.refactoring.smells.couplers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void shouldSetUpCorrectly() {
        Score score = new Score();
        Player player = new Player("Elvira", score);
        player.wins(10);
        player.loses(2);
        assertEquals(player.getName(), "Elvira");
    }

}