package com.sadatmalik.initializationandcleanup.exercises;

// Create a class with a String field that is initialized at the point of definition,
// and another one that is initialized by the constructor. What is the difference between
// the two approaches?
public class Exercise2 {
    String s = "Sadat"; // assigned when object memory is allocated
    String m;

    public Exercise2() {
        this.m = "Malik"; // initialized after object has been allocated
    }

    public static void main(String[] args) {
        Exercise2 e2 = new Exercise2();
        System.out.println(e2.s + " " + e2.m);
    }
}
