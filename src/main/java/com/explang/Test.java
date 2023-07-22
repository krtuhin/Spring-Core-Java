package com.explang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/configuration/explang-config.xml");

        Demo demo = (Demo) context.getBean("demo", Demo.class);

        System.out.println(demo);
    }
}
