package NewPractice;

import java.io.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) throws IOException {
        List<String> textLines = new ArrayList<>();
        textLines.add("One");
        textLines.add("Two");
        textLines.add("Three");
        textLines.add("Four");
        textLines.add("Five");

        String filePath = "/Users/badribagateliya/IdeaProjects/Learning Project/MyNewModule/PracticeModule/src/NewPractice/text";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String str : textLines) {
                writer.write(str);
                writer.newLine();
            }
            System.out.println("Arraylist written to file successfully");
            System.out.println("-----------------------------------------");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("File contents: ");
            System.out.println(" ");
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        }
    }
}
