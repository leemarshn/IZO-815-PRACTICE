package com.company.chapter2.operators;

public class Scope {

    public static void main(String[] args) {

        int x;
        x=10;

        if (x==10){

            int y = 20;

            System.out.println("X & Y " + x +" " +y);

            x= y*2;
            System.out.println("x =y *2: " +x);

        }
//        x= y*2;

    }

}
