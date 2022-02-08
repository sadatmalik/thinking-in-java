package com.sadatmalik.initializationandcleanup.exercises;

// Create a class called Tank that can be filled and emptied, and has a termination
// condition that it must be empty when the object is cleaned up. Write a finalize( )
// that verifies this termination condition. In main( ), test the possible scenarios
// that can occur when your Tank is used.
public class Exercise12 {
    public static void main(String[] args) {
        new Tank("t1").fill();
        new Tank("t2");
        System.gc();
    }
}

class Tank {

    boolean isFilled;
    String name;

    Tank(String name) {
        this.name = name;
    }

    void fill() {
        isFilled = true;
    }

    void empty() {
        isFilled = false;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " finalized - isFilled = " + isFilled);
        super.finalize();
    }
}