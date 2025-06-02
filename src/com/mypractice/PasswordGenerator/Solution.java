package com.mypractice.PasswordGenerator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";

        String template = alphabet + alphabet.toUpperCase() + digits;
        Random random = new Random();
        char[] password = new char[8];

        String string = "";
        while (!string.matches("\\d.*") ||
                !string.matches(".*\\p{Ll}.*") ||
                !string.matches(".*\\p{Lu}.")) {

            for (int i = 0; i < password.length; i++) {
                password[i] = template.charAt(random.nextInt(template.length()));
            }
            string = new String(password);
        }

        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            outputStream.write(string.getBytes());
            return outputStream;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
