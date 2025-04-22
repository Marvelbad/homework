package com.mypractice.TestCode;

public class UpperCasePrinter  implements Printable {
    private final Printable printer;

    public UpperCasePrinter(Printable printer) {
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        printer.print(text.toUpperCase());
    }
}
