package com.mypractice.FindSymbol;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFileName = reader.readLine();
        String outputFileName = reader.readLine();

        try (BufferedReader inputFileReader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter outputFileWriter = new BufferedWriter(new FileWriter(outputFileName));
        ) {
            List<String> fileContent = new ArrayList<>();
            String line;
            while ((line = inputFileReader.readLine()) != null) {
                String replaced = line.replace(".", "!");
                outputFileWriter.write(replaced);
                outputFileWriter.newLine();
            }
        }
    }
}