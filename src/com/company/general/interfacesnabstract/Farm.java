package com.company.general.interfacesnabstract;

public class Farm {
    public static void main(String[] args) {
        Animal pig = new Pig();
        Animal duck = new Duck();

        pig.eat();
        pig.makeSound();

        duck.makeSound();
        duck.eat();

        Pig pig1 = new Pig();
        pig1.eat();

//        pig=duck;

        System.out.println(pig.equals(duck));
    }
}
