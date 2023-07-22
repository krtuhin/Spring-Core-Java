package com.standalone_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/configuration/standalone-collection-config.xml");

        Person person = context.getBean("person", Person.class);
        Person person1 = context.getBean("person1", Person.class);

        System.out.println(person);
        System.out.println(person.getFriends().getClass().getName());
        System.out.println(person.getCourse().getClass().getName());
        System.out.println(person.getProperties().getClass().getName());

        System.out.println(person1);
        System.out.println(person1.getFriends().getClass().getName());
    }
}
