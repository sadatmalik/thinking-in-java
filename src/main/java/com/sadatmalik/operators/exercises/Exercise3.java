package com.sadatmalik.operators.exercises;

// Create a class containing a float and use it to demonstrate aliasing during method calls.
public class Exercise3 {

    public static void main(String[] args) {
        Value val = new Value(1);
        triple(val);
        System.out.println(val.f);
    }

    private static void triple(Value v) {
        v.f *= 3;
    }

}

class Value {
    float f;

    public Value(float f) {
        this.f = f;
    }
}
