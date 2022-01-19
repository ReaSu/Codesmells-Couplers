package com.refactoring.smells.couplers;

public class Player {

    private final String name;
    private final Points points;

    public Player(final String name, final Points points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public Points getPoints() {
        return points;
    }

    public void wins(int points) {
        this.points.setWins(points);
    }

    public void loses(int points) {
        this.points.setLosses(points);
    }
}
