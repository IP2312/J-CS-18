package org.example.model;

import org.example.controller.PersonManagementReader;
import org.example.controller.PersonManagementWriter;

import java.io.IOException;

public class PV {
PersonManagementReader pmReader = new PersonManagementReader();
PersonManagementWriter pmWriter = new PersonManagementWriter();

    public void createNewPv(String newPVName) throws IOException {
        pmWriter.createNewPV(newPVName, pmReader.sizeOfPV());
    }

}
