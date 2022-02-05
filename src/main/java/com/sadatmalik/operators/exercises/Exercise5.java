package com.sadatmalik.operators.exercises;

// Create a class called Dog containing two Strings: name and says. In main( ), create
// two dog objects with names “spot” (who says, “Ruff!”) and “scruffy” (who says, “Wurf!”).
// Then display their names and what they say.
public class Exercise5 {
    private static Dog spot = new Dog("Spot", "Ruff!");
    private static Dog scruffy = new Dog("Scruffy", "Wurf!");

    public static void main(String[] args) {
        System.out.println(spot.toString());
        System.out.println(scruffy.toString());
    }
}

class Dog {
    private String name;
    private String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public String toString() {
        return name + " says " + says;
    }
}
