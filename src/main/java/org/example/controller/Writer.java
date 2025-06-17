package org.example.controller;

import java.io.*;
import java.nio.file.Files;
import java.util.List;

public class Writer {
    public void createNewPV(String name, int sizeOfPV) throws IOException {
        File file = new File ("data/personenManagements.csv");
        boolean exists = file.exists();
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
        if (exists){
            bw.newLine();
            bw.append(String.valueOf(sizeOfPV)).append(",").append(name);
        }else {
            bw.write("ID,Name");
            bw.newLine();
            bw.write("1," + name);
        }

        bw.close();
    }
}
