package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        //dependency injection object
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/configuration/collection-config.xml");

        Emp e = (Emp) context.getBean("emp");

        System.out.println(e);
        System.out.println(e.getName());
        System.out.println(e.getPhones());
        System.out.println(e.getAddresses());
        System.out.println(e.getCourses());
        System.out.println(e.getProps());
    }
}
