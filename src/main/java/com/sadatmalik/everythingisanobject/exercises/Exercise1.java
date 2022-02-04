package com.sadatmalik.everythingisanobject.exercises;

// Create a class containing an int and a char that are not initialized,
// and print their values to verify that Java performs default initialization.
public class Exercise1 {
    private int i;
    private char c;

    public static void main(String[] args) {
        Exercise1 e1 = new Exercise1();
        System.out.println("'i' initialised to: " + e1.i);
        System.out.println("'c' initialised to: " + e1.c);
    }
}
