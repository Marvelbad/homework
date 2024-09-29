package com.mypractice.Object_class.Student;

import java.util.Objects;

public class Student {
    private final String name;
    private final int id;
    private final String university;

    public Student(String name, int id, String university) {
        this.name = name;
        this.id = id;
        this.university = university;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, university);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return Objects.equals(name, student.name) && id == student.id && university.equals(student.university);
    }


    public static void main(String[] args) {
        Student student1 = new Student("Alex", 335, "Yells");
        Student student2 = new Student("Alex", 335, "Yells");

        System.out.println(student1.equals(student2));
    }
}