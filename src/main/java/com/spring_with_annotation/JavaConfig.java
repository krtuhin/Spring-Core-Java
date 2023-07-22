package com.spring_with_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration - this annotation for using java class as configuration file like XML file
//@ComponentScan - used to scan the bean annotation
//@Bean - used to treat the class as component, it is used in java configuration class

@Configuration
@ComponentScan(basePackages = "com.spring_with_annotation")
public class JavaConfig {

    //when it is used, don't need to use @Component annotation with reference class
    //need to use method name to get the bean
    
//    @Bean
//    public Address getAddress() {
//
//        Address address = new Address();
//
//        return address;
//    }

    //changing name of bean, by default it get the method name
    @Bean(name = {"st", "student"})
    public Student getStudent() {

        Student student = new Student();

//        student.setAddress(getAddress());

        return student;
    }
}
