package com.sadatmalik.controllingexecution.exercises;

import java.util.Random;

// Write a program that generates 25 random int values. For each value, use
// an if-else statement to classify it as greater than, less than, or equal to
// a second randomly generated value.
public class Exercise2 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 25; i++) {
            int x = rand.nextInt(50);
            int y = rand.nextInt(50);
            if (x < y) {
                System.out.println(x + " is less than " + y);
            } else if (x == y) {
                System.out.println(x + " is equal to " + y);
            } else {
                System.out.println(x + " is greater than " + y);
            }
        }

    }
}
