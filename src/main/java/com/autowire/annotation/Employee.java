package com.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

    //@Autowired - can be declare any of these three places
    
    //either here
    @Autowired
    private Address address;

    public Employee() {
    }

    //or here
    @Autowired
    public Employee(Address address) {
        this.address = address;

        System.out.println("This is constructor..!");
    }

    public Address getAddress() {
        return address;
    }

    //or here
    @Autowired
    public void setAddress(Address address) {
        this.address = address;

        System.out.println("This is setter method..!");
    }

    @Override
    public String toString() {
        return "Employee{" + "address=" + address + '}';
    }
}
