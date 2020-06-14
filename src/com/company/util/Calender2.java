package com.company.util;
import com.jeanne.Timer;

import java.util.*;

public class Calender2 {

    public static void main(String[] args) {
        MyTimerTask myTask = new MyTimerTask();
        java.util.Timer myTimer = new java.util.Timer();
        myTimer.schedule(myTask, 1, 1);
        try {

            Thread.sleep(10000);

        }catch (InterruptedException exc){
            System.out.println("Time out ");
        }


        myTimer.cancel();
        System.out.println("SYSTEM OUTPUT");
        System.out.println("986002335 Passwords Scanned");
        System.out.println("Owner - Lee N");





    }
}
