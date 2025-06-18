package org.example.controller;

import org.example.model.Choices;

import java.util.Optional;

public class InputValidator {
    public boolean validateChoice(char choice){
        for (Choices c : Choices.values()) {
            if (c.getChoiceChar() == choice) {
                return true;
            }
        }
        System.out.println("Not a valid choice.");
        return false;
    }

    public Optional<Integer> validateChosenPV(String choice, int sizePv){
        try{
            int intChoice = Integer.parseInt(choice.trim());
            if (intChoice > 0 || intChoice <= sizePv){
                return Optional.of(intChoice);
            }
            return  Optional.empty();
        }catch(NumberFormatException e){
           return Optional.empty();
        }
    }
}
