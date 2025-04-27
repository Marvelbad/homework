package com.mypractice.Reflection;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        Class<? extends Person> personClass = person.getClass();
        Class<Person> personClass2 = Person.class;
        Class<?> personClass3 = Class.forName("com.mypractice.Reflection.Person");

        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + ", "
            + method.getReturnType() + ", " + Arrays.toString(method.getParameterTypes()));
        }
    }
}
