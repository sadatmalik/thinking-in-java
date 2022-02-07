package com.sadatmalik.initializationandcleanup.exercises;

// Create a class with a finalize( ) method that prints a message. In main( ),
// create an object of your class. Explain the behavior of your program.
public class Exercise10 {

    public static void main(String[] args) {
        new Exercise10();
        System.gc(); // this will force a gc, invoking finalize on the no longer referenced Exercise10 instance
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize called");
        super.finalize();
    }
}
