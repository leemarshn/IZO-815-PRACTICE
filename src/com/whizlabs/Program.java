package com.whizlabs;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int a[] = {1,2,53,4};
        int b[][] = {{1,2,4},{2,2,1},{3,43,56}};
        System.out.println(a[3]==b[0][2]);
        System.out.println(a[2]==b[2][1]);
        System.out.println(b[0][0]);
        System.out.println(a[2]);
    }
}
