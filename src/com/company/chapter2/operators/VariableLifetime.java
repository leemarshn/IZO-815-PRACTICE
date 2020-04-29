package com.company.chapter2.operators;

public class VariableLifetime {


    public static void main(String[] args) {

        int x =0;

        for(x=0; x<3; x++){

            int y =-1;
            System.out.println(y);
            y = 100;
            System.out.println(y);
        }

    }

}
