package com.company.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertCMtoInches {

    public static void main(String[] args) {
        Scanner cms = new Scanner(System.in);

        System.out.println("Enter a Number to106 Covert To CM and type Done to exit");
        double inches =0.0;
        try {
            while (cms.hasNext()){
             if (cms.hasNextDouble()){
                 inches = cms.nextDouble()*0.393701;
                 System.out.println(inches +" inches");
             }  else{
                 String str = cms.next();
                 if (str.equals("done")){
                     System.out.println("Thank you for using our converter");
                     System.out.println("check us out at lenhac.com");
                     System.out.println("See you (-: Lee N");
                     break;
                 }else {
                     System.out.println("Data Format Error: please input an integer");
                 }
             }
            }

        }catch (InputMismatchException e){
            System.out.println("The value you entered is not an Integer" +e);
        }

    }
}
