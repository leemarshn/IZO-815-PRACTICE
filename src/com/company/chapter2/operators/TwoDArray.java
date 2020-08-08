package com.company.chapter2.operators;

public class TwoDArray {

    public static void main(String[] args) {
        int[][] twoD = new int[4][5];
        int k, j = 0, i,m;

        for (i=0;i<4;i++) {
            for (k = 0; k < 5; k++) {
                    twoD[i][k] = j;
                j++;
            }
        }

        for (i=0; i<4; i++){
            for (k=0;k<5;k++)

                System.out.print(twoD[i][k]+ " ");
                System.out.println();


        }
    }

}
