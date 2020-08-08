package com.jeanne;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Timer {

    int getHour(){
        LocalDateTime today = LocalDateTime.now();
        int hour = today.getHour();

        return hour;
    }


    String  checkBirthDay(){
        String birthday ="";
        if (getDate().equals("Today is: Tuesday, April 28, 2020")){
           birthday ="=======================================" + "\r\n" + "a TUESDAY like today many years ago you were BORN, " + "\r\n" + "HAPPY BIRTHDAY :-) " + "\r\n" +"Look out for your new HEIGHTS, " +"\r\n" + "For the SEED will GROW well" ;
        }

        return birthday;
    }

    String getDate(){

        LocalDate date = LocalDate.now();
        String today = "Today is: " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        return today;
    }

    String getTime(){
        LocalTime currentTime = LocalTime.now();
        String time = " " + currentTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
        return time;
    }

    void greetings(String name){
        name = name;
        Timer df = new Timer();
        int hour = df.getHour();
        String birthday = df.checkBirthDay();
        String date = df.getDate();
        String time = df.getTime();

        if(hour>=6 & hour<=11){
            System.out.println("Good Morning " +name + "\r\n" + date + " " + time + "\r\n" + birthday);
        }
        else if(hour>=12 & hour<=15){
            System.out.println("Good Afternoon " +name + "\r\n" + date + " " + time + "\r\n" + birthday);
        }else if (hour>=16 & hour<=20){
            System.out.println("Good Evening " +name + "\r\n" + date + " " + time + "\r\n" + birthday);
        }else {
            System.out.println("Good Morning " +name + "\r\n" + date + " "+ " " + time +  "\r\n" + " oh, oh :-) We didn't expect you here at this time" + "\r\n" +checkBirthDay());
        }
    }

}
