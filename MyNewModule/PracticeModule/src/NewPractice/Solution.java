package NewPractice;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws Exception {
        Robot robot1 = new Robot("Alex", 30);
        Robot robot2 = new Robot("Alex", 20);

        System.out.println(robot1.equals(robot2));
        System.out.println(robot1.hashCode());
        System.out.println(robot2.hashCode());

        System.out.println(robot1.hashCode() == robot2.hashCode());
    }
}