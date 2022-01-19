package com.refactoring.smells.couplers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class LeaderBoardTest {

    @Test
    void print() {
        KDA kda1 = new KDA(10, 0, 0, new Score());
        KDA kda2 = new KDA(0, 0, 10, new Score());
        Player peter = new Player("Andrea", kda1);
        Player martin = new Player("Robin", kda2);
        ArrayList<Player> players = new ArrayList<>();
        players.add(peter);
        players.add(martin);

        LeaderBoard leaderBoard = new LeaderBoard(players);

        Assertions.assertEquals("Andrea 10/0/0/20\n" +
                                "Robin 0/0/10/10\n", leaderBoard.print());
    }
}