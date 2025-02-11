package NewPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<String> files = new TreeSet<String>();

        while (true) {
            try {
                String input = reader.readLine();
                if (input.equalsIgnoreCase("end")) {
                    break;
                }
                files.add(input);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}