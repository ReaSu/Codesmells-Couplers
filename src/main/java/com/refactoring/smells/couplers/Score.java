package com.refactoring.smells.couplers;

public class Score {

    public static final int KILL_FACTOR = 2;
    public static final int DEATH_FACTOR = 5;
    private KDA kda;

    public void setKda(KDA kda) {
        this.kda = kda;
    }

    public int totalScore() {
        return kda.getKills() * KILL_FACTOR
               - kda.getDeaths() * DEATH_FACTOR
               + kda.getAssists();
    }
}
