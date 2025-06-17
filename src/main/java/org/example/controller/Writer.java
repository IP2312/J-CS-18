package org.example.controller;

import java.io.*;
import java.nio.file.Files;
import java.util.List;

public class Writer {
    public void createNewPV(String name) throws IOException {
        File file = new File ("data/personenManagements.csv");
        boolean exists = file.exists();
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
        if (exists){
            List<String> lines = Files.readAllLines(file.toPath());
            bw.newLine();
            bw.append(String.valueOf(lines.size()) + "," + name);
        }else {
            bw.write("ID,Name");
            bw.newLine();
            bw.write("1," + name);
        }

        bw.close();
    }
}
