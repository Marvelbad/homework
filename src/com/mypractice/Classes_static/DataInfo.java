package com.mypractice.Classes_static;

public class DataInfo {
    public static void main(String[] args) {
        String string = "12.86";
        double num = Double.parseDouble(string);
        long rounded = Math.round(num);
        System.out.println(rounded);
    }
}
