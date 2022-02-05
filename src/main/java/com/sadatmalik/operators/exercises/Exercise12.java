package com.sadatmalik.operators.exercises;

// Start with a number that is all binary ones. Left shift it, then use the
// unsigned right-shift operator to right shift through all of its binary positions,
// each time displaying the result using Integer.toBinaryString( ).
public class Exercise12 {
    public static void main(String[] args) {
        int i = 0xFFFF;
        System.out.println(Integer.toBinaryString(i));

        i <<= 1;
        System.out.println(Integer.toBinaryString(i));

        while (i != 0) {
            i >>= 1;
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
