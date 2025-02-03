package com.mypractice.Object_class;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mazda", "RX-7", 2008);
        Car car1 = new Car("Mazda", "RX-7", 2008);
        Car car2 = new Car("Mazda", "RX-5", 2008);

        if (car.hashCode() == car1.hashCode()) {
            System.out.println(car.equals(car1));
        }
        if (car.hashCode() == car2.hashCode()) {
            System.out.println(car.equals(car2));
        } else {
            System.out.println(false);
        }


        //System.out.println(car.equals(car1));
        //System.out.println(car.equals(car2));
    }
}
