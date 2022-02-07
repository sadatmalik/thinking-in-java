package com.sadatmalik.initializationandcleanup.exercises;

// Create a class called Dog with an overloaded bark( ) method. This method should be
// overloaded based on various primitive data types, and print different types of barking,
// howling, etc., depending on which overloaded version is called. Write a main( ) that
// calls all the different versions.

// Ex6. Modify the previous exercise so that two of the overloaded methods have two
// arguments (of two different types), but in reversed order relative to each other. Verify
// that this works.
public class Exercise5 {
    public static void main(String[] args) {
        new Dog().bark(1);
        new Dog().bark(1f);
        new Dog().bark(1, 1f);
        new Dog().bark(1f, 1);
    }
}

class Dog {
    public void bark(int i) {
        System.out.println("Barking is integral to life");
    }

    public void bark(float f) {
        System.out.println("Floating like a piece of bark");
    }

    public void bark(int i, float f) {
        System.out.println("To integer, or to float, that is the question");
    }

    public void bark(float i, int f) {
        System.out.println("To float, or to integer, that is the question");
    }

}
