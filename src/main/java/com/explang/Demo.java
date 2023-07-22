package com.explang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{9 > 7 ? 100 : 200}")
    private int x;

    @Value("#{34+87+89}")
    private int y;

    @Value("#{T(Integer).MAX_VALUE}")
    private int z;

    @Value("#{T(java.lang.Math).sqrt(625)}")
    private int a;

    @Value("#{T(Math).PI}")
    private double pi;

    @Value("#{new String('Tuhin Kumar')}")
    private String name;

    @Value("#{11 > 7}")
    private boolean isActive;

    @Override
    public String toString() {
        return "Demo{" + "x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + ", pi=" + pi + ", name=" + name + ", isActive=" + isActive + '}';
    }
}
