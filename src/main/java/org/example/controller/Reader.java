package org.example.controller;

import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public char[] readPV() throws IOException {
        FileReader reader = new FileReader("data/addresses.csv");
        char[] content = new char[100];
        reader.read(content);
        reader.close();
        return content;
    }
}
