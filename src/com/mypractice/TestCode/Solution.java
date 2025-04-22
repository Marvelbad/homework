package com.mypractice.TestCode;

public class Solution {
    public static void main(String[] args) {
        Printable printer = new CensorPrinter(new UpperCasePrinter(new StarPrinter(new Printer())));

        printer.print("This is some real SHIT, Badri. Fix this FUCKing code.");
    }
}
