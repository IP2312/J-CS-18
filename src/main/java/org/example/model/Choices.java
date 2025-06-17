package org.example.model;

public enum Choices {
    NewPV('N'),
    AnzeigenPV('A'),
    BeendenPV('Q'),
    NewPerson('P'),
    Search('S'),
    Quit('Q');

    private final char choiceChar;

    Choices(char choiceChar){

        this.choiceChar = choiceChar;
    }

    public char getChoiceChar() {
        return choiceChar;
    }
}
