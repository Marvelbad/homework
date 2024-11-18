package com.mypractice.DataExchange;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class DataExchange {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Accept", "application/json");


        /*sending JSON*/
        String jsonData = "{\"message\": \"Hello from best Backend developer!\"}";
        byte[] postData = jsonData.getBytes(StandardCharsets.UTF_8);
        connection.setRequestProperty("Content-Length", String.valueOf(postData.length));

        /*sending data*/
        try (OutputStream output = connection.getOutputStream()) {
            output.write(postData);
            output.flush();
        }

        /*reading answer*/
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {

            /*if exception happened*/
            try (BufferedReader errorReader = new BufferedReader(
                    new InputStreamReader(connection.getErrorStream(), StandardCharsets.UTF_8))) {
                String line;
                while ((line = errorReader.readLine()) != null) {
                    System.out.println("Error: " + line);
                }
            }
        } finally {
            connection.disconnect();
        }
    }
}