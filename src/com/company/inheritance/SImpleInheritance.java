package com.company.inheritance;

public class SImpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 3;
        superOb.j =4;

        System.out.println("Show contents of superOb: ");
        superOb.showij();
        System.out.println();


        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;

        System.out.println("show contents of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();

        System.out.println("sum of i+J+k");
        subOb.sum();
    }
}
