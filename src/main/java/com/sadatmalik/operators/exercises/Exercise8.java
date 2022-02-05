package com.sadatmalik.operators.exercises;

// Show that hex and octal notations work with long values. Use Long.toBinaryString( )
// to display the results.
public class Exercise8 {
    public static void main(String[] args) {
        long l1 = 0xabcd; //hex, 'leading 0x'
        System.out.println(Long.toBinaryString(l1));

        long l2 = 0777; //octal, leading '0'
        System.out.println(Long.toBinaryString(l2));
    }
}
