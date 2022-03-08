package com.sadatmalik.functionalprogramming;

class X {
    String f() {
        return "X::f()";
    }
}

interface MakeString {
    String make();
}

interface TransformX {
    String transform(X x);
}

// With an unbound reference, the signature of the functional method
// (the single method in the interface) no longer quite matches the
// signature of the method reference. There’s a good reason, which is
// that you need an object to call the method on.
public class UnboundMethodReference {
    public static void main(String[] args) {
        // MakeString ms = X::f;    // won't work - no 'this' reference to x
        TransformX sp = X::f;

        X x = new X();
        System.out.println(sp.transform(x)); // Java knows it must take the first argument,
                                             // which is effectively 'this', and call the method on it.

        System.out.println(x.f()); // Same effect
    }
}
/* Output:
X::f()
X::f()
*/
