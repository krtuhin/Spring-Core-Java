package com.autowire;

public class Employee {

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
