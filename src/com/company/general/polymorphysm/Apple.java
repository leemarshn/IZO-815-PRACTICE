package com.company.general.polymorphysm;

public class Apple extends Fruit {


    private int calories;

    public Apple(int calories) {
        super(calories);
        this.calories=calories;
    }

    public void removeSeeds(){
        System.out.println("seeds have been removed");
    }

    @Override
    public void makeJuice(){
        System.out.println("Apple Juice has been made " + calories + "g of calories");
    }
}
