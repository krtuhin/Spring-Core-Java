package com.spring_with_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        //application context using java annotation
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Student student = (Student) context.getBean("st", Student.class);

        System.out.println(student);
        student.study();
    }
}
