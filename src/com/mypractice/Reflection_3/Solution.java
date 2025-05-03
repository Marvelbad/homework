package com.mypractice.Reflection_3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        Child child = Child.class.getDeclaredConstructor().newInstance();
        System.out.println(child.getPrivateField());
        setPrivateParentField(child, "privateField", "новая строка");
        System.out.println(child.getPrivateField());

//        getParentClassName();
    }

    public static void setPrivateParentField(Object childObject, String fieldName, Object value) throws NoSuchFieldException, IllegalAccessException {
        Field privateField = childObject.getClass().getSuperclass().getDeclaredField(fieldName);
        privateField.setAccessible(true);
        privateField.set(childObject, value);
    }

//    public static void getParentClassName() {
//        Class<?> aClass = Child.class.getSuperclass();
//        String name = aClass.getSimpleName();
//        System.out.println(name);
//    }

}





