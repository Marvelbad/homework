package com.mypractice.TokenizerTask;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenizerTask {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        return query.split(delimiter);
    }
}
