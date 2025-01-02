package NewPractice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String sourceFile = console.readLine();
        FileInputStream stream = new FileInputStream(sourceFile);

        List<Integer> data = new ArrayList<>();
        while (!sourceFile.isEmpty()) {

        }
    }
}