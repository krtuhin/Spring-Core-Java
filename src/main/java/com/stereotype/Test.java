package com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/configuration/stereotype-config.xml");

        Student student = (Student) context.getBean("obj", Student.class);

        System.out.println(student);
        System.out.println(student.getFreinds().getClass().getName());

        System.out.println(student.hashCode());

        Student student1 = (Student) context.getBean("obj", Student.class);
        System.out.println(student1.hashCode());

        Teacher teacher = (Teacher) context.getBean("teacher", Teacher.class);
        Teacher teacher1 = (Teacher) context.getBean("teacher", Teacher.class);

        System.out.println(teacher.hashCode());
        System.out.println(teacher1.hashCode());
    }
}
