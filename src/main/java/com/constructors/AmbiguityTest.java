package com.constructors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AmbiguityTest {

    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("com/configuration/cons-config.xml");

        Ambiguity a = (Ambiguity) context.getBean("am");

        System.out.println(a);
    }
}
