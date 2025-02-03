package com.mypractice.DataExchange.Refactored;


import java.io.*;
import java.net.HttpRetryException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class DataExchangeRef {
    private static final String DEFAULT_ENCODING = StandardCharsets.UTF_8.name();
    private static final String CONTENT_TYPE_JSON = "application/json";

    public static void main(String[] args) {
        DataExchangeRef client = new DataExchangeRef();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Hello! Enter message you wanna sent: ");
            String userMessage = scanner.nextLine();

            String jsonBody = String.format("{\"message\": \"%s\"}", userMessage);

            try {
                String response = client.sendPostRequest("http://httpbin.org/post", jsonBody);
                System.out.println("Server answer: " + response);
            } catch (HttpRetryException e) {
                System.out.printf("Error" + e.getLocation());
            }
        }
    }
}
