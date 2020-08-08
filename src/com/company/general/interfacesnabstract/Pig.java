package com.company.general.interfacesnabstract;

public class Pig extends Animal {

    @Override
    void makeSound() {
        System.out.println("The pig is snorting");
    }

    @Override
    public void eat(){
        System.out.println("the pig is eating");
    }


}
