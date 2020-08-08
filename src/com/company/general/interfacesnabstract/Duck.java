package com.company.general.interfacesnabstract;

public class Duck extends Animal {
    @Override
    void makeSound() {
        System.out.println("The duck is Quacking");
    }

    public void eat(){
        System.out.println("the duck is peckiling");
    }
}
