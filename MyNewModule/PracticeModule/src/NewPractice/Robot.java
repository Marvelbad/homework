package NewPractice;

import java.util.Objects;

public class Robot {
    private final String name;
    private final int age;

    public Robot(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Robot robot = (Robot) obj;
        return age == robot.age && Objects.equals(name, robot.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}