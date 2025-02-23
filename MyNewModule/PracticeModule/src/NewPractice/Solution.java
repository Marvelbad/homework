package NewPractice;

import java.io.*;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
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
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception {
        String path = "/Users/badribagateliya/IdeaProjects/Learning Project/MyNewModule/PracticeModule/src/NewPractice/textFile";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String name = line.replaceAll("\\d", "").trim();

                String date = line.replaceAll("\\D", "").replaceFirst("(\\d{2})(\\d{2})(\\d+)", "$1 $2 $3");
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
                Date date1 = dateFormat.parse(date);

                PEOPLE.add(new Person(name, date1));

                PEOPLE.forEach(person -> System.out.println(person.getName() + " - " + person.getBirthDate()));

//                System.out.println(name + " " + dateFormat.format(date1));
            }
        }
    }
}