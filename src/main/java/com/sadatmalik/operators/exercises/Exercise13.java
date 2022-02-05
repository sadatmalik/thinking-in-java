package com.sadatmalik.operators.exercises;

// Write a method that displays char values in binary form.
// Demonstrate it using several different characters.
public class Exercise13 {

    public static void main(String[] args) {
        printCharAsBinary('a');
        printCharAsBinary('b');
        printCharAsBinary('c');
    }

    public static void printCharAsBinary(char c) {
        System.out.println(Integer.toBinaryString(c));
    }
}
