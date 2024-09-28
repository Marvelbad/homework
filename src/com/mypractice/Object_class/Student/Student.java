package com.mypractice.Object_class.Student;

import java.util.Objects;

public class Student {
    private final String name;
    private final int id;
    private final int gpa;
    private final String university;

    public Student(String name, int id, int gpa, String university) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.university = university;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, gpa, university);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || !(object instanceof Student)) return false;
        Student student = (Student) object;
        return name.equals(student.name) && id == student.id && gpa == student.gpa && university.equals(student.university);
    }


    public static void main(String[] args) {
        Student student1 = new Student("Alex", 335, 5, "Yells");
        Student student2 = new Student("Alex", 335, 5, "Yells");

        System.out.println(student1.equals(student2));
    }

}