package com.company.lamdas;

public class MyStringOps {
    // A static method that reverses a string.
    String strReverse(String str) {
        String result = "";
        int i;

        for(i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);

        return result;
    }
}
