package com.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/configuration/autowire-annotation-config.xml");

        Employee employee = (Employee) context.getBean("emp", Employee.class);

        System.out.println(employee);
    }
}
