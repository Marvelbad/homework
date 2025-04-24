package com.mypractice.Coding;

public class Solution {
    public static void main(String[] args) {
        String text = "This is example of text with white spaces";
        int spaceCount = text.length() - text.replaceAll(" ", "").length();
        System.out.println(spaceCount);
    }
}
