package com.company.chapter2.operators;

public class Average {

    public static void main(String[] args) {
        double avrg[] = {8,5,6,7,4};
        float result = 0;
        int i;
        for (i=0;i<5;i++){
            result +=avrg[i]/avrg.length;
        }
        System.out.println(result);

    }
}
