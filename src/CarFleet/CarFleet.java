package CarFleet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarFleet {
    List<Car> cars = new ArrayList<>();

    private final Map<Integer, String> renters = new HashMap<>();


    public void addCar(Car car) {
        cars.add(car);
    }

    public void printAllCars() {
        for (Car car : cars) {
            System.out.println(car.getInfo());
        }
    }

    public Car findCarById(int id) {
        for (Car car : cars) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }

    /**
     * Арендует машину.
     */
    public boolean rentCar(int id, String renterName) {
        Car car = findCarById(id);
        if (car != null && car.isAvailable) {
            car.isAvailable = false;
            renters.put(id, renterName);
            System.out.println("Машина успешно арендована: " + car + " | Арендатор: " + renterName);
            return true;
        } else if (car != null) {
            System.out.println("Машина уже в аренде.");
        } else {
            System.out.println("Машина с таким ID не найдена.");
        }
        return false;
    }

    /**
     * Возвращает машину.
     */
    public boolean returnCar(int id) {
        Car car = findCarById(id);
        if (car != null && car.isAvailable) {
            car.isAvailable = true;
            renters.remove(id);
            System.out.println("Машина возвращена: " + car);
            return true;
        } else if (car != null) {
            System.out.println("Машина уже свободна.");
        } else {
            System.out.println("Машина с таким ID не найдена.");
        }
        return false;
    }

    /**
     * Арендует клиентам.
     */
    public void printRenters() {
        if (renters.isEmpty()) {
            System.out.println("Сейчас нет арендованных машин.");
            return;
        }

        for (Map.Entry<Integer, String> entry : renters.entrySet()) {
            System.out.println("Машина ID: " + entry.getKey() + " арендована: " + entry.getValue());
        }
    }
}
