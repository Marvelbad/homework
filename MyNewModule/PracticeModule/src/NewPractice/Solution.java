package NewPractice;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> personMap = new HashMap<>();

        personMap.put("user", new Person.User());
        personMap.put("loser", new Person.Loser());
        personMap.put("coder", new Person.Coder());

        while (true) {
            String key = reader.readLine();

            if (!(personMap.containsKey(key.toLowerCase()))) {
                System.out.println("No such word/class here...");
                break;
            }
            Person person = personMap.get(key.toLowerCase());
            person.doWork();
        }
    }
}