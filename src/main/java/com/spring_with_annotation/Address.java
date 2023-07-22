package com.spring_with_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
class Address {

    @Value("Delhi Road")
    private String street;

    @Value("Kolkata")
    private String city;

    @Override
    public String toString() {
        return "Address{" + "street=" + street + ", city=" + city + '}';
    }
}
