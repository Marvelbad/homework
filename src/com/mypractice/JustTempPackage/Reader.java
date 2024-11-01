package com.mypractice.JustTempPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("text.txt"))) {
            int lineCount = 0;
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("Количество строк: " + lineCount);
        } catch (IOException e) {

            System.out.println("Oops: " + e.getMessage());
        }
    }
}