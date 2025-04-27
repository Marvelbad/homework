package com.mypractice.Reflection;

public class Person {
    private String name;
    private int id;

    public Person() {
        this.name = "No name";
        this.id = -1;
    }

    public Person(String name, int age) {
        this.name = name;
        this.id = age;
    }

    public void sayHello() {
        System.out.println("Person with id: " +  id + " and name: " + name + " says hello");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
