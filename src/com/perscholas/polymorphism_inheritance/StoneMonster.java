package com.perscholas.polymorphism_inheritance;

public class StoneMonster extends Monster {
    // Constructor
    public StoneMonster(String name) {
        super(name);
    }

    // Method
    @Override
    public String attack(){
        return "Attack with stones!";
    }
}
