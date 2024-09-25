package com.mypractice.Object_class.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 246, "NYPD", 3000);
        Employee employee1 = new Employee("John", 246, "NYPD", 3000);
        Employee employee2 = new Employee("Alex", 350, "Office", 8000);

        if (employee.hashCode() == employee1.hashCode()) {
            System.out.println(employee.equals(employee1));
        }
        if (employee.hashCode() == employee2.hashCode()) {
            System.out.println(employee.equals(employee2));
        } else {
            System.out.println(false);
        }
    }
}
