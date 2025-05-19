package com.mypractice.TwoFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String file1Lines = console.readLine();
        String file2Lines = console.readLine();
        console.close();

        List<String> originalLines = new ArrayList<>();
        List<String> updatedLines = new ArrayList<>();

        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1Lines));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2Lines))
        ) {
            String originaLine;
            while ((originaLine = reader1.readLine()) != null) {
                originalLines.add(originaLine);
            }

            String updatedLine;
            while ((updatedLine = reader2.readLine()) != null) {
                updatedLines.add(updatedLine);
            }
        }

        int i = 0;
        int j = 0;

        while (i < originalLines.size() && j < updatedLines.size()) {
            if (originalLines.get(i).equals(updatedLines.get(j))) {
                lines.add(new LineItem(Type.SAME, originalLines.get(i)));
                i++;
                j++;
            } else if ((j + 1) < updatedLines.size() && originalLines.get(i).equals(updatedLines.get(j + 1))) {
                lines.add(new LineItem(Type.ADDED, updatedLines.get(j)));
                j++;
            } else if ((i + 1) < originalLines.size() && originalLines.get(i + 1).equals(updatedLines.get(j))) {
                lines.add(new LineItem(Type.REMOVED, originalLines.get(i)));
                i++;
            }
        }

        // Всё, что осталось в originalLines — это REMOVED
        while (i < originalLines.size()) {
            lines.add(new LineItem(Type.REMOVED, originalLines.get(i)));
            i++;
        }

// Всё, что осталось в updatedLines — это ADDED
        while (j < updatedLines.size()) {
            lines.add(new LineItem(Type.ADDED, updatedLines.get(j)));
            j++;
        }
    }


    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }

    public static enum Type {
        ADDED,
        REMOVED,
        SAME
    }
}
