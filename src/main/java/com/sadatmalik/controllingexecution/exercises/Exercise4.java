package com.sadatmalik.controllingexecution.exercises;

// Write a program that uses two nested for loops and the modulus operator (%)
// to detect and print prime numbers (integral numbers that are not evenly divisible
// by any other numbers except for themselves and 1).
public class Exercise4 {

    public static void main(String[] args) {
        for (int i = 1; i < 25; i++) {
            boolean possiblePrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    possiblePrime = false;
                }
            }
            if (possiblePrime) {
                System.out.println("Found prime: " + i);
            }
        }
    }
}
