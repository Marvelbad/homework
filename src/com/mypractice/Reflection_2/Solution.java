package com.mypractice.Reflection_2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class Solution {
    /**
     * Получает по полному имени класса.
     */
    public static void main(String[] args) throws Exception {
       Class<?> clazz = Class.forName("com.mypractice.Reflection_2");
    }

    /**
     * Прямое обращение к обьекту типа Class.
     */
    public static void main2(String[] args) {
        Class<?> clazz = Person.class;
    }

    /**
     * В случае когда есть экземпляр класса.
     */
    public static void main3(String[] args) {
        Person person = new Person();

        Class<?> clazz = person.getClass();
    }
}
