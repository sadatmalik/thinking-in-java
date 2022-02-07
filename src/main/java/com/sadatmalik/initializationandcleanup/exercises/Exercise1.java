package com.sadatmalik.initializationandcleanup.exercises;

// Create a class containing an uninitialized String reference.
// Demonstrate that this reference is initialized by Java to null.
public class Exercise1 {
    String s;

    public static void main(String[] args) {
        Exercise1 e1 = new Exercise1();
        System.out.println(e1.s);
    }
}
