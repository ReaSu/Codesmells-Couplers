package com.refactoring.smells.couplers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ScoreBoardTest {

    @Test
    void print() {
        Score score1 = new Score();
        Score score2 = new Score();
        Player peter = new Player("Andrea", score1);
        Player martin = new Player("Robin", score2);
        ArrayList<Player> players = new ArrayList<>();
        players.add(peter);
        players.add(martin);

        ScoreBoard scoreBoard = new ScoreBoard(players);

        Assertions.assertEquals("Andrea, Total: 0, Rating: Bad\n" +
                                "Robin, Total: 0, Rating: Bad\n", scoreBoard.print());
    }
}