package com.sadatmalik.controllingexecution.exercises;

// A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34,
// and so on, where each number (from the third on) is the sum of the previous two.
// Create a method that takes an integer as an argument and displays that many
// Fibonacci numbers starting from the beginning, e.g., If you run java Fibonacci 5
// (where Fibonacci is the name of the class) the output will be: 1, 1, 2, 3, 5.
public class Exercise9 {

    public static void main(String[] args) {
        fib(9);
    }

    private static void fib(int n) {
        if (n <= 0)
            return;

        if (n >= 1) {
            System.out.print(1 + " ");
        }

        if (n >= 2) {
            System.out.print(1 + " ");
        }

        int x = 1;
        int y = 1;
        for (int i = 3; i <= n; i++) {
            int tmp = y;
            y = x + y;
            x = tmp;
            System.out.print(y + " ");
        }
    }
}
