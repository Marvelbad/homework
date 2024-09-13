package com.mypractice.TokenizerTask;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Tokenaizer_Ver_2 {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String packagePath, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(packagePath, delimiter);
        int n = tokenizer.countTokens();
        String[] tokens = new String[n];
        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            tokens[i++] = tokenizer.nextToken();
        }
        return tokens;
    }
}
