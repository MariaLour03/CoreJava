package com.perscholas.polymorphism_inheritance;

public class WaterMonster extends Monster {
    // Constructor
    public WaterMonster(String name) {
        super(name);
    }

    // Method
    @Override
    public String attack(){
        return "Attack with water!";
    }
}
