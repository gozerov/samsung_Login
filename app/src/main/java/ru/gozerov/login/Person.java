package ru.gozerov.login;

import java.io.Serializable;

public class Person implements Serializable {

    private final String name;

    private final String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}
