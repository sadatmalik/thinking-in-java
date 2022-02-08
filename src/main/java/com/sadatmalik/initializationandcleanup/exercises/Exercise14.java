package com.sadatmalik.initializationandcleanup.exercises;

// Create a class with a static String field that is initialized at the point of definition,
// and another one that is initialized by the static block. Add a static method that prints both
// fields and demonstrates that they are both initialized before they are used.
public class Exercise14 {
    static String s = "Sadat";
    static String m;

    String n;

    {
        n = "name";
        System.out.println(n);
    }

    static {
        m = "Malik";
    }

    private static void print() {
        System.out.println(s + " " + m);
    }

    public static void main(String[] args) {
        new Exercise14();
        print();
    }
}
