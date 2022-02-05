package com.sadatmalik.operators.exercises;

import java.util.Random;

// Write a program that simulates coin-flipping.
public class Exercise7 {

    public static void main(String[] args) {
        Coin coin = new Coin();
        for (int i = 0; i < 10; i++) {
            System.out.println("Coin toss is heads: " + coin.toss());
        }
    }

}

class Coin {
    private Random rand = new Random();

    public boolean toss() {
        return rand.nextBoolean();
    }
}
