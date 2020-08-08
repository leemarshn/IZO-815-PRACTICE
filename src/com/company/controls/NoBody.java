package com.company.controls;

public class NoBody {

    public static void main(String[] args) {
        int i = 1000;
        int j = 2000;

        while(++i < --j);

        System.out.println("Midpoint is " + i);
    }

}
