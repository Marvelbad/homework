package com.mypractice.person;

import com.mypractice.Iphone.Iphone;

import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return age == person.age && name.equals(person.name);
     }
     @Override
     public int hashCode() {
        return Objects.hash(name, age);
     }

    public static void main(String[] args) {
        Person person = new Person("Alex", 30);
        Person person1 = new Person("Alex", 30);

        System.out.println(person.equals(person1));
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
    }

}
