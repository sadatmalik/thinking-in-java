package com.sadatmalik.initializationandcleanup.exercises;

// Create a class with a default constructor (one that takes no arguments)
// that prints a message. Create an object of this class.

// Ex4. Add an overloaded constructor to the previous exercise that takes a
// String argument and prints it along with your message.
public class Exercise3 {

    public Exercise3() {
        System.out.println("Exercise3() constructor called");
    }

    public Exercise3(String s) {
        System.out.println(s + " - " + "Exercise3() constructor called");
    }

    public static void main(String[] args) {
        new Exercise3();
        new Exercise3("Sadat");
    }
}
