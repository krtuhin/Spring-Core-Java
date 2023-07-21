package com.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        //this class is the parent class of ApplicationContext interface which is a abstract class
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/configuration/lifecycle-config.xml");

        Laptop laptop = (Laptop) context.getBean("laptop");

        System.out.println(laptop);

        //calling destroy method
        context.registerShutdownHook();
    }
}
