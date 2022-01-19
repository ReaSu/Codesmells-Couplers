package com.refactoring.smells.couplers;

public class Score {

    public int killFactor = 2;
    public int deathFactor = 5;
    KDA kda;

    public void setKda(KDA kda) {
        this.kda = kda;
    }

    public void setKillFactor(int killFactor) {
        this.killFactor = killFactor;
    }

    public void setDeathFactor(int deathFactor) {
        this.deathFactor = deathFactor;
    }

    public int totalScore() {
        return kda.getKills() * killFactor
               - kda.getDeaths() * deathFactor
               + kda.getAssists();
    }
}
