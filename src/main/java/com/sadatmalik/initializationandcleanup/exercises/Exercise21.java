package com.sadatmalik.initializationandcleanup.exercises;

// Create an enum of the least-valuable six types of paper currency.
// Loop through the values( ) and print each value and its ordinal( ).
public class Exercise21 {
    public static void main(String[] args) {
        for (Currency c : Currency.values()) {
            System.out.println("[" + c.ordinal() + "] " + c);
        }
    }
}

enum Currency {
    FIVER, TENNER, TWENTY, FIFTY, HUNDRED
}