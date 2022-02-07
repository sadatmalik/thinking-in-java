package com.sadatmalik.initializationandcleanup.exercises;

// Create a class with two methods. Within the first method, call the second method twice:
// the first time without using this, and the second time using this—just to see it working;
// you should not use this form in practice.
public class Exercise8 {

    public static void main(String[] args) {
        new Exercise8().one();
    }

    public void one() {
        System.out.println("testing testing");
        two();
        this.two();
    }

    public void two() {
        System.out.println("one two three");
    }

}
