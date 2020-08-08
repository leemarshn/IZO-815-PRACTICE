package com.company.general.polymorphysm;

public class Fruit {
    private int calories;

    public Fruit(int calories) {
        this.calories = calories;
    }

    public void makeJuice(){
        System.out.println("make juice " + calories);
    }
}
