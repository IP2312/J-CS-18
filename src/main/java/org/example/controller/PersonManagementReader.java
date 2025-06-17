package org.example.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PersonManagementReader {
    public List<String> readPV() throws IOException {
        return Files.readAllLines(Paths.get("data/personenManagements.csv"));
    }

    public int sizeOfPV() throws IOException {
        List <String> lines = Files.readAllLines(Paths.get("data/personenManagements.csv"));
        return lines.size();
    }
}
