package fr.p10.miage.rps.model;

import java.util.Random;

public enum RPSEnum {
    ROCK(0),
    PAPER(1),
    SCISSORS(2);
    private final int index;

    RPSEnum(int index) {
        this.index = index;
    }

    public static RPSEnum aleatoire() {
        Random rdm = new Random();
        int index = rdm.nextInt(3);
        if (index == ROCK.index) return ROCK;
        if (index == PAPER.index) return PAPER;
        if (index == SCISSORS.index) return SCISSORS;
        return null;
    }
}