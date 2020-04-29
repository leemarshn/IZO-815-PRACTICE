package com.company.chapter2.operators;

public class Conversion {

    public static void main(String[] args) {

        byte b;
        int i = 257;
        double d=129;

        System.out.println("\n conversion of int to byte. ");
        b = (byte) i;
        System.out.println("i and  b = " + i +  " " +b);
        System.out.println("\n conversion of double to int");
        i=(int)d;
        System.out.println("int i and double d: " + i + " " + d );
        System.out.println("conversion of double to byte");
        b=(byte) d;
        System.out.println("byte b: "+b +"  double d: " +d);


    }

}
