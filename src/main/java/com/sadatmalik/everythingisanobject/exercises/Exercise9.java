package com.sadatmalik.everythingisanobject.exercises;

// Write a program that demonstrates that autoboxing works for all the primitive types and their wrappers.
public class Exercise9 {

    char c = new Character(('a'));
    byte b = new Byte("1");
    short s = new Short("1");
    int i = new Integer(1);
    long l = new Long(1);
    float f = new Float(1);
    double d = new Double(1);
    boolean bool = new Boolean(true);

    Character c_w = 'a';
    Byte b_w = 1;
    Short s_w = 1;
    Integer i_w = 1;
    Long l_w = 1l;
    Float f_w = 1f;
    Double d_w = 1d;
    Boolean bool_w = true;

    public static void main(String[] args) {
        Exercise9 e9 = new Exercise9();

        System.out.println(e9.c);
        System.out.println(e9.b);
        System.out.println(e9.s);
        System.out.println(e9.i);
        System.out.println(e9.l);
        System.out.println(e9.f);
        System.out.println(e9.d);
        System.out.println(e9.bool);

        System.out.println(e9.c_w);
        System.out.println(e9.b_w);
        System.out.println(e9.s_w);
        System.out.println(e9.i_w);
        System.out.println(e9.l_w);
        System.out.println(e9.f_w);
        System.out.println(e9.d_w);
        System.out.println(e9.bool_w);
    }
}
