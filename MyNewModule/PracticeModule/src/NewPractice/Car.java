package NewPractice;

public class Car implements Comparable<Car> {
    private final String name;
    private final int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public int compareTo(Car otherCar) {
        return this.name.compareTo(otherCar.name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                " speed=" + speed +
                '}';
    }
}
