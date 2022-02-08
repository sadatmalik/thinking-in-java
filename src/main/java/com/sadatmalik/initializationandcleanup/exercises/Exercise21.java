package com.sadatmalik.initializationandcleanup.exercises;

// Create an enum of the least-valuable six types of paper currency.
// Loop through the values( ) and print each value and its ordinal( ).

// Ex22. Write a switch statement for the enum in the previous example.
// For each case, output a description of that particular currency.
public class Exercise21 {
    public static void main(String[] args) {
        for (Currency c : Currency.values()) {
            System.out.print("[" + c.ordinal() + "] " + c + ": ");
            currencyDescription(c);
        }
    }

    private static void currencyDescription(Currency c) {
        switch (c) {
            case FIVER:
                System.out.println("Five Alive!");
                break;
            case TENNER:
                System.out.println("Ten Hens!");
                break;
            case TWENTY:
                System.out.println("Twenty of the best!");
                break;
            case FIFTY:
                System.out.println("Half century fox");
                break;
            case HUNDRED:
                System.out.println("Centurion");
                break;
        }
    }
}

enum Currency {
    FIVER, TENNER, TWENTY, FIFTY, HUNDRED
}