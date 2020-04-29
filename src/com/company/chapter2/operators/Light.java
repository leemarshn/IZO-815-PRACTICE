package com.company.chapter2.operators;

import java.util.Arrays;

public class Light {
    //compute the distance at which light travels

    public static void main(String[] args) {
        long lightSpeed;
        int days;
        int seconds;
        long distance;

        //approximate the speed of light in miles per second
        lightSpeed = 186000;

        days = 1000;
        seconds = days * 60 * 60 * 24;

        distance = lightSpeed * seconds;

        System.out.println(seconds);

        System.out.println("In " +days +" Days");
        System.out.println("Light will travel in about ");
        System.out.println(distance + " Miles. ");
    }

}
