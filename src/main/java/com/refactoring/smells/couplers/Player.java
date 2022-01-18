package com.refactoring.smells.couplers;

public class Player {

    private final String name;
    private final KDA kda;

    public Player(final String name, final KDA kda) {
        this.name = name;
        this.kda = kda;
    }

    public String getName() {
        return name;
    }

    public KDA getKda() {
        return kda;
    }

}
