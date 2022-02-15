package com.refactoring.smells.couplers;

public class Score {

    private int wins = 0;
    private int losses = 0;

    public String getRating() {
        if(getTotal() < 10) {
            return "Bad";
        } else if(getTotal() < 20) {
            return "OK";
        } else if(getTotal() < 30) {
            return "Good";
        } else {
            return "Excellent";
        }
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getTotal() {
        return getWins() - getLosses();
    }
}
