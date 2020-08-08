package com.company.util;

import java.util.Calendar;
import java.util.Formatter;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask{


        public void run() {
            Calendar cal = Calendar.getInstance();

            Formatter fmt = new Formatter();

            fmt.format("SNIFFING: %ts:%tL:%tN", cal,cal, cal);
            System.out.println(fmt);
            fmt.close();
        }


}
