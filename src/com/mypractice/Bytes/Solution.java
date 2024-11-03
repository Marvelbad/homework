package com.mypractice.Bytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))) {

            byte[] bytesIn = inputStream.readAllBytes();






        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
