package com.mypractice.JustTempPackage;

import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {
    private FileWriter writer;

    public FileConsoleWriter(FileWriter writer) {
        this.writer = writer;
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        writer.write(cbuf, off, len);
        System.out.println(new String(cbuf, off, len));
    }
}