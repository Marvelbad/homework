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

        treeMap.put(5, "String");
        treeMap.put(2,"Hello");
        treeMap.put(1, "Name");
        treeMap.put(3, "Alex");
        treeMap.put(10, "Alex");
        treeMap.put(9, "Alex");
        treeMap.put(12, "Alex");
        treeMap.put(11, "Alex");

        System.out.println(treeMap);
    }
}
