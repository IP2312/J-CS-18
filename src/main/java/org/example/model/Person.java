package org.example.model;
//"id","firstname","lastname","date of birth","addressId","gender","personManagementId"

import java.time.LocalDate;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Adress adress;
    private Gender gender;
    private int personManagementId;

    public Person(int id, String firstName, String lastName, LocalDate birthDate, Adress adress, Gender gender, int personManagementId) {

    }
}
