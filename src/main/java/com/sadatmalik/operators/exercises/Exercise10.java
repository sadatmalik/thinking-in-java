package com.sadatmalik.operators.exercises;

// Write a program with two constant values, one with alternating binary ones and zeroes,
// with a zero in the least-significant digit, and the second, also alternating, with a one
// in the least-significant digit (hint: It’s easiest to use hexadecimal constants for this).
// Take these two values and combine them in all possible ways using the bitwise operators,
// and display the results using Integer.toBinaryString( ).
public class Exercise10 {

    public static void main(String[] args) {

        int a = 0xAA;
        int b = 0x55;

        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));

        int c = a & b;

        System.out.println("a & b = " + Integer.toBinaryString(c));

        int d = a | b;

        System.out.println("a | b = " + Integer.toBinaryString(d));

        int e = a ^ b;

        System.out.println("a ^ b = " + Integer.toBinaryString(e));

        int f = ~a;

        System.out.println("~a = " + Integer.toBinaryString(f));

        int g = ~b;

        System.out.println("~b = " + Integer.toBinaryString(g));
    }
}
