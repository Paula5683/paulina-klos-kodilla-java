package com.kodilla.good.patterns.challenges;

public class Buyer {
    String name;
    String lastName;

    public Buyer(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
