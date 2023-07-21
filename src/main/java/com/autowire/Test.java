package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/configuration/autowire-config.xml");

        Employee employee = (Employee) context.getBean("emp", Employee.class);
        Employee employee1 = (Employee) context.getBean("emp1", Employee.class);
        Employee employee2 = (Employee) context.getBean("emp2", Employee.class);

        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);
    }
}
