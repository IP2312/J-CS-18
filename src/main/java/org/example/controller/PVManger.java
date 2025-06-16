package org.example.controller;

import org.example.view.PVView;

import java.io.BufferedReader;
import java.io.IOException;

public class PVManger {
    private Reader reader;
    private Writer writer;
    private PVView view;


    public PVManger(Reader reader, Writer writer, PVView view) {
        this.reader = reader;
        this.writer = writer;
        this.view = view;
    }

    public void startPVManager() throws IOException {

            char choice = view.displayOptions();



            char[] content = reader.readPV();
            view.displayPV(content);

    }



}
