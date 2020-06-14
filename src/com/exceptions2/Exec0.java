package com.exceptions2;

public class Exec0 {
    public static void main(String[] args) {


        int d = 0;
        int n = 43;
        try {


            int div = n / d;
            int[] q = new int[9];
            q[8] = 10;

            System.out.println(q[8]);
        }catch (ArithmeticException e){
            System.out.println("You tried to do some bangi manenos: " + e);
        }finally {
            System.out.println("division by: " +n + " and " +d);
        }
    }
}
