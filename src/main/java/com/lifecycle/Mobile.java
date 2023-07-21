package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//declared init() and destroy() methods using interfaces that are InitializingBean and DisposableBean
public class Mobile implements InitializingBean, DisposableBean {

    private double price;

    public Mobile() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile{" + "price=" + price + '}';
    }

    //this is the abstract method of InitializingBean interface
    @Override
    public void afterPropertiesSet() throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        System.out.println("This is init method by InitializingBean interface..!");
    }

    //this is the abstract method of DisposableBean interface
    @Override
    public void destroy() throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        System.out.println("This is destroy method by DisposableBean interface..!");
    }
}
