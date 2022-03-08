package com.sadatmalik.functionalprogramming;

interface Strategy {
    String approach(String msg);
}

class Soft implements Strategy {
    @Override
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }
}

class Unrelated {
    static String twice(String msg) {
        return msg + " " + msg;
    }
}

public class Strategize {
    Strategy strategy;
    String msg;

    Strategize(String msg) {
        strategy = new Soft(); // defauilt strategy 'Soft' assigned in constructor
        this.msg = msg;
    }

    void communicate() {
        System.out.println(strategy.approach(msg));
    }

    void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public static void main(String[] args) {
        Strategy[] strategies = {
                new Strategy() { // a strategy defined as anonymous inner class
                    public String approach(String msg) {
                        return msg.toUpperCase() + "!";
                    }
                },
                msg -> msg.substring(0, 5), // a Strategy defined as a lambda expression
                Unrelated::twice // a Strategy defined as method reference - note Unrelated does not itself implement Strategy
        };

        Strategize s = new Strategize("Hello there");
        s.communicate();
        for (Strategy newStrategy : strategies) {
            s.changeStrategy(newStrategy);
            s.communicate();
        }
    }
}
/* Output:
hello there?
HELLO THERE!
Hello
Hello there Hello there
*/
