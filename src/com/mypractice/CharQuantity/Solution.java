package com.mypractice.CharQuantity;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileName1));
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(fileName1));
             BufferedInputStream inputStream1 = new BufferedInputStream(new FileInputStream(fileName2));


        ) {

            byte[] byteArr = new byte[8192];
            byte
            while (inputStream.read() != -1) {
                inputStream.read(byteArr);
            }

        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }
}