package com.mypractice.CharQuantity;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        try (FileInputStream input1 = new FileInputStream(fileName1);
             FileInputStream input2 = new FileInputStream(fileName2);
        ) {
            ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
            int bytesRead;
            byte[] buffer = new byte[4096];
            while ((bytesRead = input2.read(buffer)) != -1) {
                arrayOutputStream.write(buffer, 0, bytesRead);
            }
            while ((bytesRead = input1.read(buffer)) != -1) {
                arrayOutputStream.write(buffer, 0, bytesRead);
            }
            try (FileOutputStream outputStream = new FileOutputStream(fileName1)
            ) {
                arrayOutputStream.writeTo(outputStream);
            }
        }
    }
}