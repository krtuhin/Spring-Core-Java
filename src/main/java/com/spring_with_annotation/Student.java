package com.spring_with_annotation;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;

//@Component
public class Student {

    //auto wiring
    @Autowired
    private Address address;

    public void study() {
        System.out.println("I am reading book...!");
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "address=" + address + '}';
    }
}
