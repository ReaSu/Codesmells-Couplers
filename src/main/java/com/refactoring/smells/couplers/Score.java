package com.refactoring.smells.couplers;

public class Score {

    private KDA kda;

    public void setKda(KDA kda) {
        this.kda = kda;
    }

    public int getKills() {
        return kda.getKills();
    }

    public int getDeaths() {
        return kda.getDeaths();
    }

    public int getAssists() {
        return kda.getAssists();
    }

    public int totalScore() {
        return getKills() * 2
               - getDeaths() * 5
               + getAssists();
    }
}
