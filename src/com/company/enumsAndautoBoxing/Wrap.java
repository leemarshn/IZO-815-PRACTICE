package com.company.enumsAndautoBoxing;

public class Wrap {
    public static void main(String args[]) {

        Integer iOb = Integer.valueOf(100);

        int i = iOb.intValue();
        Integer b = 200;

        System.out.println(i); // displays 100 100
    }
}
