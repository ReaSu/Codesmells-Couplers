package com.refactoring.smells.couplers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class LeaderBoardTest {

    @Test
    void print() {
        Score score1 = new Score();
        Score score2 = new Score();
        KDA kda1 = new KDA(10, 0, 0, score1);
        KDA kda2 = new KDA(0, 0, 10, score2);
        Player peter = new Player("Peter", kda1);
        Player martin = new Player("Martin", kda2);
        ArrayList<Player> players = new ArrayList<>();
        players.add(peter);
        players.add(martin);

        LeaderBoard leaderBoard = new LeaderBoard(players);
        String print = leaderBoard.print();

        Assertions.assertEquals("Peter 10/0/0/20\n" +
                "Martin 0/0/10/10\n", print);
    }
}