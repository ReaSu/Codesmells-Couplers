package com.refactoring.smells.couplers;

public class KDA {

    private final int kills;
    private final int deaths;
    private final int assists;
    public final Score score;

    public KDA(final int kills, final int deaths, final int assists, Score score) {
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.score = score;
        score.setKda(this);
    }

    public int getKills() {
        return kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getAssists() {
        return assists;
    }

    public int getTotalScore() {
        return score.totalScore();
    }
}
