package com.sadatmalik.initializationandcleanup.exercises;

// Create a class with two (overloaded) constructors. Using this, call
// the second constructor inside the first one.
public class Exercise9 {

    Exercise9() {
        this("Overloaded");
        System.out.println("Default");
    }

    Exercise9(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        new Exercise9();
    }
}
