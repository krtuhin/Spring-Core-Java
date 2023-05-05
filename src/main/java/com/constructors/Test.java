package com.constructors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext("com/configuration/cons-config.xml");

        Person p = (Person) context.getBean("person");
        Person ps = (Person) context.getBean("ps");
        Person person = (Person) context.getBean("p");

        System.out.println(p);
        System.out.println(ps);
        System.out.println(person);
    }
}
