package NewPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) throws IOException {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

//        List<String> words = List.of("Java", "Spring", "Predicate", "Stream", "API");

        List<Integer> numbers = List.of(2,4,8,1,5);

        List<Integer> num = numbers.stream()
                .map(x -> x * 2)
                .filter(x-> x % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(num);
    }
}
