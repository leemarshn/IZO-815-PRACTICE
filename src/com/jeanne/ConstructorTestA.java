package com.jeanne;

public class ConstructorTestA {
    String name;
    int age;

    ConstructorTestA(String name, int age){

        age = age;
        name = name;

        System.out.println(name + " is " +age + " years old");

    }

    ConstructorTestA(){
        System.out.println("This is a default object");
    }

    {
        System.out.println("LeeN's Birthday is on Tuesday");
    }

}
