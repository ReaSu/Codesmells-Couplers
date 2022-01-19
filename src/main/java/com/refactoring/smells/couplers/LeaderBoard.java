package com.refactoring.smells.couplers;

import java.util.ArrayList;
import java.util.List;

public class LeaderBoard {

    private final List<Player> players = new ArrayList<>();

    public LeaderBoard(final List<Player> players) {
        this.players.addAll(players);
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        for(Player player : players) {
            sb.append(print(player)).append("\n");
        }
        return sb.toString();
    }

    private String print(final Player player) {
        return player.getName() + " " +
               player.getKda().getKills() + "/" +
               player.getKda().getDeaths() + "/" +
               player.getKda().getAssists() + "/" +
               player.getKda().getTotalScore();
    }
}
