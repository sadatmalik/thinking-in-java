package com.sadatmalik.operators.exercises;

// Write a method that takes two String arguments and uses all the boolean comparisons
// to compare the two Strings and print the results. For the == and !=, also perform the
// equals( ) test. In main( ), call your method with some different String objects.
public class Exercise14 {

    public static void main(String[] args) {
        String s1 = "Sadat";
        String s2 = "Sadat";
        compare(s1, s2);
    }

    private static void compare(String s1, String s2) {
        System.out.println(s1 == s2);
        System.out.println(s1 != s2);
        System.out.println(s1.equals(s2));
    }
}
