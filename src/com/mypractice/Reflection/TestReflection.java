package com.mypractice.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

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

        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + ", "
                    + field.getType());
        }
    }


    public static void main2(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        //
        Class<?> classObject1 = Class.forName(scanner.next());
        Class<?> clasObject2 = Class.forName(scanner.next());
        String methodName = scanner.next();

        Method m = classObject1.getMethod(methodName, clasObject2);
        Object o1 = classObject1.getDeclaredConstructor().newInstance();
        Object o2 = clasObject2.getConstructor(String.class).newInstance("String value");

        m.invoke(o1, o2);

        System.out.println(o1);
    }
}
