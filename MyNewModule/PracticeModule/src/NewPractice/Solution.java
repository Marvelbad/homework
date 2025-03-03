package NewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws Exception {
        printStringReverse("Hello");
    }

    public static void printStringReverse(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("Wrong string");
        }

        String res = str.substring(0,3);

        System.out.println(new StringBuilder(res).reverse());
    }
}
