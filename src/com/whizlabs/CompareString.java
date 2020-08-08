package com.whizlabs;

import java.util.Arrays;

public class CompareString {
    public static void main(String[] args) {
        String s1 = "rheka";
        String s2 = new String("Rheka");

        System.out.print(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2);


    }
}
