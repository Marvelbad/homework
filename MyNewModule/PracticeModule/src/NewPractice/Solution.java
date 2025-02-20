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
        if (args == null || args.length == 0) return;

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String fileName = console.readLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            if (args[0].equals("-u")) {
                String fileData;
                while ((fileData = reader.readLine()) != null) {
                    String currentId = fileData.substring(0, 8).trim();
                    Integer id = Integer.parseInt(currentId);

                    String productName = fileData.substring(8, 38).trim();
                    String price = fileData.substring(38, 46).trim();
                    String quantity = fileData.substring(46).trim();


                    if (currentId.equals(args[1])) {
                        String updateLine = String.format("%-8s%-30s%-8s%-4s",
                                args[1],
                                args[2],
                                args[3],
                                args[4]);
                        treeMap.put(id, updateLine);
                    } else {
                        treeMap.put(id, String.format("%-30s%-8s%-4s", productName, price, quantity));
                    }
                }
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
                writer.write(String.format("%-8s%s\n", entry.getKey().toString(), entry.getValue()));
            }
        }

        String id = args[1];
        String productName = args[2];
        String price = args[3];
        String quantity = args[4];
    }
}