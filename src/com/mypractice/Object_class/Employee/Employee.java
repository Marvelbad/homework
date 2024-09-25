package com.mypractice.Object_class.Employee;

import java.util.Objects;

public class Employee {
    String name;
    int id;
    String department;
    double salary;

    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, department, salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return this.id == employee.id && this.department.equals(employee.department);
    }
}
