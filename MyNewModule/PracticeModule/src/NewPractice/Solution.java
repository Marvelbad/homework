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
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<Integer, String> files = new TreeMap<>();

        while (true) {
            String input = reader.readLine();
            if (input.equalsIgnoreCase("end")) break;

            String[] parts = input.split("\\.part");
            int partNumber = Integer.parseInt(parts[1]);
            files.put(partNumber, input);
        }
//        System.out.println(files);
        String firstFile = files.firstEntry().getValue();//вернет пару ключ-значение с наименьш ключом и вытиянем значение
        String outputFileName = firstFile.split("\\.part")[0]; //Берем все до ".part"

        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputFileName))) {
            files.entrySet().stream()
                    .map(entry -> entry.getValue()) //берем имена файлов
                    .forEach(fileName -> {
                                try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream())) {
                                    byte[] buffer = new byte[1024];
                                    int bytesRead;
                                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                                        outputStream.write(buffer, 0, bytesRead);
                                    }
                                } catch (IOException e) {
                                    throw new UncheckedIOException(e);
                                }
                            }
                    );
        }
    }
}