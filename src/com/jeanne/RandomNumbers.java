package com.jeanne;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {


        Random r = new Random();
        System.out.println(r.nextInt(1020)); // print a number between 0 and 9
        System.out.println(r.nextGaussian());
    }
}

