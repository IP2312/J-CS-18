package org.example.view;


import org.example.controller.InputValidator;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class PVView {
    Scanner sc = new Scanner(System.in);
    InputValidator inputValidator = new InputValidator();

    public char displayOptions(){
        char choice;
        do {
            System.out.println("Möchtest du eine neu Personalverwaltung anglegen(N)\nPVs Anzeigen(A) \nPerson hinzufügen(P)\nPerson suchen(S)\nBeenden(Q)?: ");
            choice = Character.toUpperCase(sc.nextLine().trim().charAt(0));
        } while (!inputValidator.validateChoice(choice));
        return choice;
    }

    public Optional<Integer> choosePv(int sizePv, List<String> pvList){
        Optional<Integer> parsedChoice;

        do {
            System.out.println("To which Pv do you want to add a Person");
            displayPV(pvList);

            String choice = sc.nextLine();
            parsedChoice = inputValidator.validateChosenPV(choice, sizePv);
        }while(parsedChoice.isEmpty());

        return parsedChoice;
    }

    public void displayPV(List<String> content) {
        for(String line : content){
            System.out.println(line);
        }
        System.out.println();

    }

    public String getNewPVName(){
        System.out.println("Name PV: ");
        return sc.nextLine();
    }
}
