package com.whizlabs;

public class FunnyLoop {

    static int x =1;
    public static void main(String[] args) {

        int[] nums ={0,1,2,3,4,5};

        for(int x:nums){
//            System.out.println(x);
            System.out.println(x+FunnyLoop.x);
        }

    }
}
