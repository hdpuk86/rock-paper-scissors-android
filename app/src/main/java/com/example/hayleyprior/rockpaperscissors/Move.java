package com.example.hayleyprior.rockpaperscissors;

/**
 * Created by hayleyprior on 08/11/2017.
 */

public enum Move {

    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    private String string;

    Move(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
