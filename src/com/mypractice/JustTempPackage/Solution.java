package com.mypractice.JustTempPackage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> list = Arrays.asList("Hello", "World");
        List<String> newArr = list.stream()
                .filter(word -> word.length() > 3)
                .toList();

        System.out.println(newArr);
    }
}
