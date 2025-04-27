package com.mypractice.Reflection;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        Class personClass = person.getClass();
        Class personClass2 = Person.class;
        Class personClass3 = Class.forName("Reflection.Person");
    }
}
