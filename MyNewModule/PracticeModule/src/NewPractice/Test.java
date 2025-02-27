package NewPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numList.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::valueOf)
                .sum();
        System.out.println(sum);
    }

//    public static void main2(String[] args) {
//        List<Integer> numList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        List<Integer> newList2 = numList.stream()
//                .filter(num -> num % 2 == 0)
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
//        System.out.println(newList2);
//
//    }


//    public static void mai4(String[] args) {
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        List<Integer> newList1 = numbers.stream()
//                .filter(num -> num % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println(newList1);
//    }
}
