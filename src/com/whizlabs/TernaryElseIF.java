package com.whizlabs;

public class TernaryElseIF {
    public static void main(String[] args) {
        int x =1;
        if(x>1){
            System.out.println(">");
        }else if (x<1){
            System.out.println("<");
        }else{
            System.out.println("=");
        }

        String k = x<1? "<": x>1 ? ">" : "=";
        System.out.println("This is Ternary ver: " +k);

        char b = 2 ^ 3|4;

        System.out.println(b);
    }
}
