package org.example.model;

public enum Choices {
    NewPV('N'),
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
