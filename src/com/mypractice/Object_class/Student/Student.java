package com.mypractice.Object_class.Student;

import java.util.Objects;

public class Student {
    private final String name;
    private final int id;
    private final int age;
    private final String major;  //Profession
    private final double gpa;
    private final String university;

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
        if (this == obj) return true; //Соблюден принцип рефлексивности , так как обьект равен самому себе.
        if (obj == null || !(obj instanceof Student)) return false; // Неравенство. Если переданный обьект null.
        Student student = (Student) obj;
        return name.equals(student.name) && id == student.id && university.equals(student.university);
    }


    public static void main(String[] args) { //Согласованность. Если два обьекта не изменяются то результат вызова equals() будет оставаться постоянным.
        Student student1 = new Student("Alex", 335, 25, "Developer", 2000, "Arizona");
        Student student2 = new Student("Alex", 335, 25, "Developer", 2000, "Arizona");
        Student student3 = new Student("John", 400, 25, "Developer", 2000, "Yells");

        if (student1.hashCode() == student2.hashCode()) { //Контракт. Если равны по equals то hashcodes будут одинаковы.
            System.out.println(student1.equals(student2)); //Симметричность. За счет сравнения полей id, university.
        } else {
            System.out.println("Not equal by hashCode");
        }

        if (student1.hashCode() == student3.hashCode()) {
            System.out.println(student1.equals(student3)); //Транзитивность была бы соблюдена если поля были бы идентичны.
        } else {
            System.out.println("Not equal by hashCode");
        }
    }
}
