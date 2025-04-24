package com.mypractice.CharQuantity;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        File path = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;

        StringBuilder builder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            builder.append(line);
        }
        String allText = builder.toString();
        int allCharsCount = allText.length();
        int allSpacesCount = allText.replaceAll("[^ ]", "").length();

        double percentage = (double) allSpacesCount / allCharsCount * 100;

        System.out.println("Symbols quantity: " + allCharsCount + "\n" + "Spaces quantity: " + allSpacesCount);
        System.out.println("Spaces percentage: " + Math.round(percentage));
    }
}
