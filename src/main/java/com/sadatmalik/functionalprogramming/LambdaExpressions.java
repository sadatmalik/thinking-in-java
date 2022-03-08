package com.sadatmalik.functionalprogramming;

interface Description {
    String brief();
}

interface Body {
    String detailed(String head);
}

interface Multi {
    String twoArg(String head, Double d);
}

public class LambdaExpressions {
    static Body bod = h -> h + " No Parens!"; // special case - single argument - don't need parens
    static Body bod2 = (h) -> h + " More details"; // normal case - parens around the argument
    static Description desc = () -> "Short info"; // no args - must use parens
    static Multi mult = (h, n) -> h + n; // more than one arg - paranthesized args list
    static Description moreLines = () -> { // multiple lines must go in braces, and use "return"
        System.out.println("moreLines()");
        return "from moreLines()";
    };

    public static void main(String[] args) {
        System.out.println(bod.detailed("Oh!"));
        System.out.println(bod2.detailed("Hi!"));
        System.out.println(desc.brief());
        System.out.println(mult.twoArg("Pi! ", 3.14159));
        System.out.println(moreLines.brief());
    }
}
/* Output:
Oh! No Parens!
Hi! More details
Short info
Pi! 3.14159
moreLines()
from moreLines()
*/