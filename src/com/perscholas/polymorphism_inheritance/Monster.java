package com.perscholas.polymorphism_inheritance;

public class Monster {
    protected String name;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Constructor
    public Monster(String name) {
        this.name = name;
    }

    // Method
    public String attack() {
       return "!^_&^$@+%$* I don't know how to attack!";
    }
}
