package com.company.controls;

public class Switch {
    public static void main(String[] args) {
        int month = 8;

        String season = null;

        switch (month){
            case 1:
            case 2:
            case 3:
                season = "winter";
//                break;
            case 4:
            case 5:
            case 6:
                season = "Spring";
//                break;
            case 7:
            case 8:
            case 9:
                season = "Summer";
//                break;
            case 10:
            case 11:
            case 12:
                season = "Autumn";
//                break;
//            default:
//                System.out.println("Month not known");
        }

        System.out.println("The " + month + "th is a " + season + " month");
    }

}
