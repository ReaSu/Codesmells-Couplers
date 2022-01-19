package com.refactoring.smells.couplers;

public class Score {

    private int wins = 0;
    private int losses = 0;
    private Points points;

    public String getRating() {
        if(points.getTotal() < 10) {
            return "Bad";
        } else if(points.getTotal() < 20) {
            return "OK";
        } else if(points.getTotal() < 30) {
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

    public void setPoints(Points points) {
        this.points = points;
    }
}
