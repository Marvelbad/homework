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
        Printer printer = new Printer("Alex");
        new Thread(printer).start();
//        thread1.start();
    }
}