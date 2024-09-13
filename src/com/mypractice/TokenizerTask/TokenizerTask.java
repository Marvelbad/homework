package com.mypractice.TokenizerTask;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenizerTask {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String packagePath, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(packagePath, delimiter);
        int tokenCount = tokenizer.countTokens();
        String[] tokens = new String[tokenCount];

        for (int i = 0; i < tokenCount; i++) {
            tokens[i] = tokenizer.nextToken();
        }
        return tokens;
    }
}
