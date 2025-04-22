package NewPractice;

public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getInfo() {
        return brand + " " + model + " " + year;
    }

    public static void main(String[] args) {
        Car car1 = new Car("BMW", "M5", 2025);
        Car car2 = new Car("Toyota", "Opa", 2012);

        Garage garage = new Garage();
        garage.addCar(car1);
        garage.addCar(car2);

        garage.printAllCars();
    }

}
