package com.sadatmalik.functionalprogramming;

interface Callable { // Single method interface
    void call(String s);
}

class Describe {
    void show(String msg) { // signature of show() conforms to Callable's call()
        System.out.println(msg);
    }
}

public class MethodReferences {
    static void hello(String name) { // also signature-conformant to call()
        System.out.println("Hello, " + name);
    }

    static class Description {
        String about;

        Description(String desc) {
            about = desc;
        }

        void help(String msg) { // signature conforms to call() - non-static method in static inner class
            System.out.println(about + " " + msg);
        }
    }

    static class Helper {
        static void assist(String msg) { // signature conforms to call() - static method in static inner class
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        Describe d = new Describe();
        Callable c = d::show; // assign a method reference for the Describe object to a Callable
        c.call("call()"); // invoke show() by calling call(), because Java maps call() onto show()

        c = MethodReferences::hello; // this is a static method reference
        c.call("Bob");

        c = new Description("valuable")::help; // another version of method attached to a live object, sometimes
        c.call("information");              // called a bound method reference

        c = Helper::assist; // method reference for a static method of a static inner class
        c.call("Help!");
    }
}
/* Output:
call()
Hello, Bob
valuable information
Help!
*/