package com.company.chapter2.operators;

public class OpsEquals {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        a +=a;
        b *=4;
        c %=2;
        d -=b;

        a=7;

        System.out.println(a + "," +b + "," + c + "," + d);

    }
}
