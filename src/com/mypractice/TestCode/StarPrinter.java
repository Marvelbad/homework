package com.mypractice.TestCode;

public class StarPrinter implements Printable {
    private final Printable printer;

    public StarPrinter(Printable printer) {
        this.printer = printer;
    }

    public void print(String text) {
        printer.print("*** " + text + " ***");
    }
}
