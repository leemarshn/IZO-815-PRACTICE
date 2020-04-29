package com.jeanne;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] names = new String[3];
        for(String name : names) { // DOES NOT COMPILE
            System.out.print(name + " ");
        }
    }
}
