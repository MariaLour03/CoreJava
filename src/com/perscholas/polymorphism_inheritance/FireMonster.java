package com.perscholas.polymorphism_inheritance;

public class FireMonster extends Monster {
    // Constructor
    public FireMonster(String name) {
        super(name);
    }

    // Method
    @Override
    public String attack() {
        return "Attack with fire!";
    }
}
