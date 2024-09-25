package com.mypractice.Object_class;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Person)) return false;
        Person person = (Person) object;
        return this.name.equals(person.name) && this.age == person.age;
    }
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}
