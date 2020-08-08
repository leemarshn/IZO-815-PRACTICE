package com.company.chapter2.operators;

public class ArrayMonths {

    public static void main(String[] args) {
        String months[] = new String[12];
        months[0] = "January";
        months[1] = "February";
        months[2] = "March";
        months[3] = "April";
        months[4] = "May";
        months[5] = "June";
        months[6] = "July";
        months[7] = "August";
        months[8] = "September";
        months[9] = "October";
        months[10] = "November";
        months[11] = "December";
//        months[12] = "January";

//        System.out.println(months[10]);

//        for (int i=0; i<months.length; i++)
//            System.out.println(months[i]);

        for (String m: months){

            System.out.println(m);
        }



    }

}
