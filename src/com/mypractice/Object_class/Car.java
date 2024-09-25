package com.mypractice.Object_class;

import java.util.Objects;

public class Car {
    String model;
    String brand;
    int year;

    public Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, brand, year);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (!(object instanceof Car)) return false;
        Car car = (Car) object;
        return this.model.equals(car.model) &&
                this.brand.equals(car.brand) &&
                this.year == car.year;
    }
}
