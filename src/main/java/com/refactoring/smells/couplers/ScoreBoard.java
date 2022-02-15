package com.refactoring.smells.couplers;

import java.util.ArrayList;
import java.util.List;

public class ScoreBoard {

    private final List<Player> players = new ArrayList<>();

    public ScoreBoard(final List<Player> players) {
        this.players.addAll(players);
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        for(Player player : players) {
            sb.append(player.getResults()).append("\n");
        }
        return sb.toString();
    }
}
