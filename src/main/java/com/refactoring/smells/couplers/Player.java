package com.refactoring.smells.couplers;

public class Player {

    private final String name;
    private final Score score;

    public Player(final String name, Score score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void wins(int points) {
        score.setWins(points);
    }

    public void loses(int points) {
        score.setLosses(points);
    }

    String getResults() {
        return getName()
               + ", Total: " + score.getTotal()
               + ", Rating: " + score.getRating();
    }
}
