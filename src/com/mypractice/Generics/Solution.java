package com.mypractice.Generics;

import jdk.nio.mapmode.ExtendedMapMode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello");
        System.out.println(stringBox.getValue());

        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(30);
        System.out.println(integerBox.getValue());
    }
}
