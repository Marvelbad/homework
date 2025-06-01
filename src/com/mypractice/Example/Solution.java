package com.mypractice.Example;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            while (true) {
                String line = scanner.nextLine();
                writer.write(line);
                writer.newLine();
                if (line.equals("exit")) break;
            }
        }
    }
}
