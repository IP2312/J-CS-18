package org.example.controller;

import org.example.model.Choices;

public class InputValidator {
    public boolean validateChoice(char choice){
        for (Choices c : Choices.values()) {
            if (c.getChoiceChar() == choice) {
                return true;
            }
        }
        return false;
    }
}
