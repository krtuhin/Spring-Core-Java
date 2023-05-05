package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCore {

    public static void main(String[] args) {

        //creating object from config file (dependency injection)
        ApplicationContext context
                = new ClassPathXmlApplicationContext("com/configuration/config.xml");

        Student std = (Student) context.getBean("st");

        System.out.println(std);
    }
}
