package com.constructors;

public class Certificate {

    private String name;

    public Certificate() {
    }

    public Certificate(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Certificate{" + "name=" + name + '}';
    }
}
