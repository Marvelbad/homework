package com.mypractice.Reflection_2;

import java.lang.reflect.Method;

public class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
