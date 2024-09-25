package com.mypractice.Object_class;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alex", 30);
        Person person2 = new Person("Alex", 30);
        System.out.println(person1.equals(person2));
    }
}
