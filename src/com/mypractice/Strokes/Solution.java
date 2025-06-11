package com.mypractice.Strokes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("file");
        words.add("and");
        words.add("B");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String str = console.readLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(str))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                int count = 0;
                for (String word : parts) {
                    if (words.contains(word)) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(line);
                }
            }
        }
    }
}

//1922 Ищем нужные строки