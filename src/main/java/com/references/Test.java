package com.references;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        //dependency injection 
        ApplicationContext context
                = new ClassPathXmlApplicationContext("com/configuration/reference-config.xml");

        A a = (A) context.getBean("a");
        A aa = (A) context.getBean("aa");
        A aaa = (A) context.getBean("aaa");

        System.out.println(a);
        System.out.println(a.getX());
        System.out.println(a.getOb().getY());

        System.out.println(aa);
        System.out.println(aaa);
    }
}
