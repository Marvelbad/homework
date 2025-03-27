package NewPractice;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    List<Car> cars = new ArrayList<Car>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void printAllCars() {
        for (Car car : cars) {
            System.out.println(car.getInfo());
        }
    }
}

