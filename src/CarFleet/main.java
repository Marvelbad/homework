package CarFleet;

public class main {
    public static void main(String[] args) {
        CarFleet fleet = new CarFleet();

        Car car1 = new Car("BMW", "5 Series", 2020, 28500, false);
        Car car2 = new Car("Audi", "A6", 2021, 15000, true);

        fleet.addCar(car1);
        fleet.addCar(car2);

        fleet.returnCar(2);

//        fleet.printAllCars();
//        System.out.println(fleet.findCarById(1));
        fleet.rentCar(2, "Badri Ivanov");
    }
}
