package CarFleet;

public class Car {
    private static int countId = 1;

    int id;
    String brand;
    String model;
    int year;
    double mileage;
    boolean isAvailable;

    public Car(String brand, String model, int year, double mileage, boolean isAvailable) {
        this.id = countId++;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public String getInfo() {
        return brand + " " + model
                + " (" + year + "), " + "Пробег: " + mileage
                + " " + "Статус: " + (isAvailable ? " Свободна" : " В аренде");
    }

    @Override
    public String toString() {
        return brand + " " + model
                + " (" + year + "), " + "Пробег: " + mileage
                + " " + "Статус: " + (isAvailable ? " Свободна" : " В аренде");
    }
}
