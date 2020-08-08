package com.company.general.polymorphysm;

public class Banana extends Fruit {

    private int calories;

    Banana(int calories) {
        super(calories);
//        this.calories=calories;

    }

    public void peel(){
        System.out.println("banana has been peeled");
    }

    public void makeJuice(){
        System.out.println("Banana Smoothie has been made: " + calories + "g calories");
    }
}
