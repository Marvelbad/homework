package com.mypractice.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        String text = "Hello24, my name is Bad and i am 280";
        Pattern pattern = Pattern.compile("(?<=\\s|^)\\d+(?=\\s|$)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
