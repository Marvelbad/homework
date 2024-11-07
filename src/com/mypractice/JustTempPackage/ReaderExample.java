package com.mypractice.JustTempPackage;

import java.io.*;
import java.util.Scanner;

public class ReaderExample {
    public static void main(String[] args) throws IOException {
        try (InputStream stream = System.in;
             InputStreamReader reader = new InputStreamReader(stream);
             BufferedReader buff = new BufferedReader(reader)) {

            String line = buff.readLine();
            char[] chars = line.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                if (i % 2 == 1) {
                    System.out.println(String.valueOf(chars[i]).toUpperCase());
                } else {
                    System.out.println(String.valueOf(chars[i]).toLowerCase());
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}