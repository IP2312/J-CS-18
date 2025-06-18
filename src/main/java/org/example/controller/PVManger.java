package org.example.controller;

import org.example.model.PV;
import org.example.view.PVView;

import java.io.IOException;
import java.util.Optional;

public class PVManger {
    private PV pv;
    private PVView view;


    public PVManger(PV pv, PVView view) {

        this.view = view;
    }

    public void startPVManager() throws IOException {

        char choice;
        do {
            choice = view.displayOptions();

            switch (choice) {
                case 'N':
                    pv.createNewPV(view.getNewPVName());
                case 'A':
                    view.displayPV(PMreader.readPV());
                    break;
                case 'P':
                    Optional<Integer> validatedChoice = view.choosePv(PMreader.sizeOfPV(), PMreader.readPV());
                    //createPerson(validatedChoice);

                    break;


            }

        } while (choice != 'Q');


    }


}
