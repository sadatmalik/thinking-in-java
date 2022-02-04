package com.sadatmalik.operators.exercises;

// Create a class containing a float and use it to demonstrate aliasing.
public class Exercise2 {

    private float f;

    public Exercise2(float f) {
        this.f = f;
    }

    public static void main(String[] args) {
        Exercise2 e2a = new Exercise2(1);
        Exercise2 e2b = new Exercise2(2);

        System.out.println("1. e2a.f = " + e2a.f + ", e2b.f = " + e2b.f);

        e2a = e2b;

        System.out.println("2. e2a.f = " + e2a.f + ", e2b.f = " + e2b.f);

        e2a.f = 3f;

        System.out.println("3. e2a.f = " + e2a.f + ", e2b.f = " + e2b.f);
    }

}
