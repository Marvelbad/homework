package NewPractice;

import java.io.*;
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
        if (!args[0].equals("-c")) return;

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String filename = console.readLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename));
             BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {

            int maxId = Integer.MIN_VALUE;
            while (reader.ready()) {
                String fileData = reader.readLine();
                String curId = fileData.substring(0, 8).trim();
                int parsedId = Integer.parseInt(curId);
                if (parsedId > maxId) {
                    maxId = parsedId;
                }
            }
            maxId++;

            // Формирование новой строки
            int newId = maxId;
            String productName = args[1];
            String price = args[2];
            String quantity = args[3];

            // Formatting
            String formattedId = String.format("%-8d", newId);
            String formattedProductName = String.format("%-30s", productName.length() > 30 ? productName.substring(0, 30) : productName);
            String formattedPrice = String.format("%-8s", price);
            String formattedQuantity = String.format("%-4s", quantity);

            String newLine = formattedId + formattedProductName + formattedPrice + formattedQuantity;

            writer.newLine();
            writer.write(newLine);
        }
    }
}