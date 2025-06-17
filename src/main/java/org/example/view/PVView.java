package org.example.view;


import org.example.controller.InputValidator;

import java.util.Scanner;

public class PVView {
    Scanner sc = new Scanner(System.in);
    InputValidator inputValidator = new InputValidator();

    public char displayOptions(){
        char choice;
        do {
            System.out.println("Möchtest du eine neu Personalverwaltung anglegen(N)\nPerson hinzufügen(P)\nPerson suchen(S)\nBeenden(Q)?: ");
            choice = Character.toUpperCase(sc.nextLine().trim().charAt(0));
        } while (!inputValidator.validateChoice(choice));
        return choice;
    }

    public void displayPV(char[] content) {
        System.out.println(content);

    }

    public String getNewPVName(){
        System.out.println("Name PV: ");
        return sc.nextLine();
    }
}
