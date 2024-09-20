package com.mypractice.OOP.Interface;

public class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bird is singing");
    }

    @Override
    public void move() {
        System.out.println("Bird is flying");
    }
}
