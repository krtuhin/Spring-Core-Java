package com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/configuration/stereotype-config.xml");

        Student student = (Student) context.getBean("obj", Student.class);

        System.out.println(student);
    }
}
