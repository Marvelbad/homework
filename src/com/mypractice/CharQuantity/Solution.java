package com.mypractice.CharQuantity;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        File path = new File("/Users/badribagateliya/IdeaProjects/Learning Project/src/com/mypractice/CharQuantity/txt");
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;

        StringBuilder builder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            builder.append(line).append("\n");
        }
        String allText = builder.toString();
        int charsCount = allText.replaceAll(" ", "").length();
        System.out.println(charsCount);
    }
}
