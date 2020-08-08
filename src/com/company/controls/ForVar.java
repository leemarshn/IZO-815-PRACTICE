package com.company.controls;

public class ForVar {

    public static void main(String[] args) {

        boolean done = false;
        int i =0;

//        for ( ; !done; ){
//
//            System.out.println("I is " +i);
//            if(i==10) done = true;
//            ++i;
////            System.out.println(i);
//
//        }
//
        for (i=0; !done;i++){
            done = true;
            System.out.println(i);
        }

    }
}
