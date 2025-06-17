package org.example.controller;

import org.example.view.PVView;

import java.io.IOException;

public class PVManger {
    private PersonManagementReader reader;
    private Writer writer;
    private PVView view;


    public PVManger(PersonManagementReader reader, Writer writer, PVView view) {
        this.reader = reader;
        this.writer = writer;
        this.view = view;
    }

    public void startPVManager() throws IOException {

        char choice;
        do {
            choice = view.displayOptions();

            switch (choice) {
                case 'N':
                    writer.createNewPV(view.getNewPVName(), reader.sizeOfPV());
                case 'A':
                    view.displayPV(reader.readPV());
                    break;
                case 'P':
                    int size = reader.sizeOfPV();


            }

        } while (choice != 'Q');


    }


}
