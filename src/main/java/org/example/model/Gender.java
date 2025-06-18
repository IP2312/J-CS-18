package org.example.model;


public enum Gender {
    männlich('m'),
    weiblich('w'),
    diverse('d');

    private final char choiceGender;

    Gender(char choiceChar){

        this.choiceGender = choiceChar;
    }
    public char getChoiceGender() {
        return choiceGender;
    }
}

