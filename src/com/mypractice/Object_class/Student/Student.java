package com.mypractice.Object_class.Student;

import java.util.Objects;

public class Student {
    String name;
    int id;
    int age;
    String major;  //Profession
    double gpa;
    String university;

    public Student(String name, int id, int age, String major, double gpa, String university) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.major = major;
        this.gpa = gpa;
        this.university = university;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, age, major, gpa, university);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Student)) return false;
        Student student = (Student) obj;
        return name.equals(student.name) && id == student.id && university.equals(student.university);
    }


    public static void main(String[] args) {
        Student student1 = new Student("Alex", 335, 25, "Developer", 2000, "Arizona");
        Student student2 = new Student("Alex", 335, 25, "Developer", 2000, "Arizona");
        Student student3 = new Student("John", 400, 25, "Developer", 2000, "Yells");

        if (student1.hashCode() == student2.hashCode()) {
            System.out.println(student1.equals(student2));
        } else {
            System.out.println("Not equal by hashCode");
        }

        if (student1.hashCode() == student3.hashCode()) {
            System.out.println(student1.equals(student3));
        } else {
            System.out.println("Not equal by hashCode");
        }
    }
}
