package com.constructors;

public class Ambiguity {

    private int a;
    private int b;

    public Ambiguity(int a, int b) {

        System.out.println("This is Integer...!");

        this.a = a;
        this.b = b;
    }

    public Ambiguity(double a, double b) {

        System.out.println("This is Double...!");

        this.a = (int) a;
        this.b = (int) b;
    }

    @Override
    public String toString() {
        return "Ambiguity{" + "a=" + a + ", b=" + b + '}';
    }

}
