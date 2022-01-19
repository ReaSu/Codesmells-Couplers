package com.refactoring.smells.couplers;

public class Points {

    public final Score score;

    public Points(Score score) {
        this.score = score;
        score.setPoints(this);
    }

    public int getTotal() {
        return score.getWins() - score.getLosses();
    }

    public int getWins() {
        return score.getWins();
    }

    public int getLosses() {
        return score.getLosses();
    }

    public void setWins(int points) {
        score.setWins(points);
    }

    public void setLosses(int points) {
        score.setLosses(points);
    }
}
