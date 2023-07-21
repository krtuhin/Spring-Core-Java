package com.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    //@Autowired - can be declare any of these three places
    
    //@Qualifier - this is used to access the bean by name when there are more than one bean with same type
    //@Qualifier annotation always followed by @Autowired annotation
    
    @Autowired
    @Qualifier("address1")
    private Address address;

    public Employee() {
    }

    public Employee(Address address) {
        this.address = address;

        System.out.println("This is constructor..!");
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;

        System.out.println("This is setter method..!");
    }

    @Override
    public String toString() {
        return "Employee{" + "address=" + address + '}';
    }
}
