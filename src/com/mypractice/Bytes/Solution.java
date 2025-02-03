package com.mypractice.Bytes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        Path path = Paths.get(fileName);

        try {
            List<String> lines = Files.readAllLines(path);
            for (int i = 0; i < lines.size(); i += 2) {
                System.out.println(lines.get(i));
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
