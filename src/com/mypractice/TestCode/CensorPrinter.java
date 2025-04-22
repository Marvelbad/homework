package com.mypractice.TestCode;

import java.util.Arrays;
import java.util.List;

public class CensorPrinter implements Printable {
    private final Printable printer;
    private final List<String> bannedWords = Arrays.asList("fuck", "shit", "badri");

    public CensorPrinter(Printable printer) {
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        String cleanText = text;
        for (String word : bannedWords) {
            cleanText = cleanText.replaceAll("(?i)" + word, "***");
        }
        printer.print(cleanText);
    }
}
