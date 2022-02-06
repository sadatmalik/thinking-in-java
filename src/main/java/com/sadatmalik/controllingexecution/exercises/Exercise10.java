package com.sadatmalik.controllingexecution.exercises;

// A vampire number has an even number of digits and is formed by multiplying
// a pair of numbers containing half the number of digits of the result. The digits
// are taken from the original number in any order. Pairs of trailing zeroes are not
// allowed. Examples include:
// 1260 = 21 * 60
// 1827 = 21 * 87
// 2187 = 27 * 81
// Write a program that finds all the 4-digit vampire numbers.
public class Exercise10 {
    public static void main(String[] args) {
        outer:
        for (int x = 10; x <= 99; x++) {
            for (int y = 10; y <= 99; y++) {
                int v = x * y;
                if (Integer.toString(v).length() > 4) {
                    continue outer;
                }
                if (isVampire(v, x, y)) {
                    System.out.println(v + " = " + x + " * " + y);
                }
            }
        }
    }

    private static boolean isVampire(int v, int x, int y) {
        String product = Integer.toString(v);
        if (product.length() != 4)
            return false;

        String concat = Integer.toString(x) + Integer.toString(y);

        boolean isVampire = true;

        for (char c : product.toCharArray()) {
            if (concat.contains(Character.toString(c))) {
                concat = concat.replaceFirst(Character.toString(c), "");
            } else {
                isVampire = false;
                break;
            }
        }
        return isVampire;
    }
}
