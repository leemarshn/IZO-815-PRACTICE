package com.company.chapter2.operators;

public class TwoDAgain {

    public static void main(String[] args) {

        int[][] twoD = new int[4][];
        twoD[0]	=	new	int[8];
        twoD[1]	=	new	int[3];
        twoD[2]	=	new	int[6];
        twoD[3]	=	new	int[5];
//        twoD[4] =   new int[9];
        int k, j = 0, i,m;

        for (i=0;i<4;i++) {
            for (k = 0; k <twoD[i].length; k++) {
                twoD[i][k] = j;
                j++;
            }
        }

        for (i=0; i<4; i++){
            for (k=0;k<twoD[i].length;k++)

                System.out.print(twoD[i][k]+ " ");
            System.out.println();


        }




    }


}
