package com.sadatmalik.operators.exercises;

// Write a program that calculates velocity using a constant distance and a constant time.
public class Exercise4 {

    private static final int distanceInMile = 100;
    private static final float timeInHours = 1.5f;

    private static float velocity() {
        return distanceInMile / timeInHours;
    }

    public static void main(String[] args) {
        System.out.printf("%.2f \n", velocity());
    }
}
