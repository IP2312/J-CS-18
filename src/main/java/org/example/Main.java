package org.example;


import org.example.controller.PVManger;
import org.example.controller.PersonManagementReader;
import org.example.controller.PersonManagementWriter;
import org.example.view.PVView;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {



        PVManger pvManger = new PVManger(new PersonManagementReader(), new PersonManagementWriter(), new  PVView());
        try {
            pvManger.startPVManager();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}