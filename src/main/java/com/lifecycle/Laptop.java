package com.lifecycle;

public class Laptop {

    private double price;

    public Laptop() {
    }

    public Laptop(double price) {
        this.price = price;

        System.out.println("Setting value by constructor..!");
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Laptop{" + "price=" + price + '}';
    }

    //init() and destroy() these two methods are the lifecycle methods of spring bean
    
    //spring init method that is automatically called by spring bean
    //we can't provide any parameter int this method but we can change the name of this method
    public void init() {
        System.out.println("This is init method..!");
    }

    //spring destroy method that is also automatically called
    //we can't provide any parameter int this method but we can change the name of this method
    public void destroy() {
        System.out.println("This is destroy method..!");
    }
}
