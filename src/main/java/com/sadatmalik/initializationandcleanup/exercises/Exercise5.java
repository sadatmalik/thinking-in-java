package com.sadatmalik.initializationandcleanup.exercises;

// Create a class called Dog with an overloaded bark( ) method. This method should be
// overloaded based on various primitive data types, and print different types of barking,
// howling, etc., depending on which overloaded version is called. Write a main( ) that
// calls all the different versions.
public class Exercise5 {
    public static void main(String[] args) {
        new Dog().bark(1);
        new Dog().bark(1f);
    }
}

class Dog {
    public void bark(int i) {
        System.out.println("Barking is integral to life");
    }

    public void bark(float f) {
        System.out.println("Floating like a piece of bark");
    }
}
