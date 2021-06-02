package com.kodilla.rps;

public enum Symbols {
    ROCK (1),
    PAPER (2),
    SCISSORS (3),
    LIZARD (4),
    SPOCK (5);

    private final int number;

    Symbols (int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
}
