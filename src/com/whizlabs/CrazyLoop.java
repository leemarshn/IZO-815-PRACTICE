package com.whizlabs;

public class CrazyLoop {
    public static void main(String[] args) {
        for(int x=9; x>0; x--){
            System.out.println(x);
            for(int y =8; x>y; y++){
                System.out.println(x+y);
            }
        }
    }
}
