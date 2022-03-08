package com.sadatmalik.functionalprogramming;

class Dog {
    String name;
    int age = -1; // For "unknown"

    Dog() {
        name = "stray";
    }

    Dog(String nm) {
        name = nm;
    }

    Dog(String nm, int yrs) {
        name = nm;
        age = yrs;
    }
}

// Dog has three constructors, and the make() methods inside the functional
// interfaces reflect the constructor argument lists (the make() methods can
// have different names).
interface MakeNoArgs {
    Dog make();
}

interface Make1Arg {
    Dog make(String nm);
}

interface Make2Args {
    Dog make(String nm, int age);
}

public class ConstructorReference {
    public static void main(String[] args) {
        MakeNoArgs mna = Dog::new; // from the interface assignment the compiler can detect which constructor to use
        Make1Arg m1a = Dog::new;
        Make2Args m2a = Dog::new;

        Dog dn = mna.make();
        Dog d1 = m1a.make("Comet");
        Dog d2 = m2a.make("Ralph", 4);
    }
}
