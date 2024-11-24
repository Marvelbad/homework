package NewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public main(String[] args) {
        Car car1 = new Car("Opel", 100);
        Car car2 = new Car("Toyota", 150);
        Car car3 = new Car("BMW", 200);

        List<Car> cars = new ArrayList<>(Arrays.asList(car1, car2, car3));
    }
}
