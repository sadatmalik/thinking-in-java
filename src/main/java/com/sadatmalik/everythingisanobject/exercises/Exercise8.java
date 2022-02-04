package com.sadatmalik.everythingisanobject.exercises;

// Write a program that demonstrates that, no matter how many objects you create of a
// particular class, there is only one instance of a particular static field in that class.
public class Exercise8 {

    private static int i = 0;

    public static void main(String[] args) {
        Exercise8 e8a = new Exercise8();
        Exercise8 e8b = new Exercise8();

        System.out.println(e8a.i);
        System.out.println(e8b.i);

        e8a.i++;

        System.out.println(e8a.i);
        System.out.println(e8b.i);

        e8b.i++;

        System.out.println(e8a.i);
        System.out.println(e8b.i);
    }

}
