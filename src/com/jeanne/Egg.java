package com.jeanne;

public class Egg {
//    public Egg() {
//        number = 5;
//    }

    private int number = 3;

    {
        number = 4;
    }
    {number = 17;}

    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
    }

    {number = 23;}
}