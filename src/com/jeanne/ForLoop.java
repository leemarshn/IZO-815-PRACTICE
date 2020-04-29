package com.jeanne;

public class ForLoop {
    public static void main(String[] args) {
        int x = 0;
        for(long y = 0, b=8; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x);
    }
}
