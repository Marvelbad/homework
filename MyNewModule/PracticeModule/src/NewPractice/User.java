package NewPractice;

public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "User{name='" + name + "', age=" + age + '}';
    }
}
