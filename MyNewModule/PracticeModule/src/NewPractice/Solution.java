package NewPractice;

import java.awt.*;
import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int input) {
        if (input < 0) return "0";
        if (input == 0) return "1";
        BigDecimal bd = new BigDecimal(1);
        for (int i = 1; i <= input; i++) {
            bd = bd.multiply(new BigDecimal(i));
        }

        return bd.toString();
    }
}