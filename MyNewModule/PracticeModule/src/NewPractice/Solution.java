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
        Example example1 = new Example();
        Thread thread1 = new Thread(example1);

        Example example2 = new Example();
        Thread thread2 = new Thread(example2);

        thread1.start();
        thread1.join();
        thread2.start();
    }
}