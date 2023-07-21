package com.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Computer {

    private int price;

    public Computer() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" + "price=" + price + '}';
    }

    //init method using java annotation
    @PostConstruct
    public void init() {
        System.out.println("This is init method using Java Annotation..!");
    }

    //destroy method using java annotation
    @PreDestroy
    public void destroy() {
        System.out.println("This is destroy method using Java Annotation..!");
    }
}
