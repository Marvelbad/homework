package com.mypractice.SymbolsFreq;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Character, Integer> map = new TreeMap<>();

        try (FileInputStream inputStream = new FileInputStream(args[0])) {
            int b;
            while ((b = inputStream.read()) != -1) {
                char c = (char) b;
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            for (Map.Entry entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}