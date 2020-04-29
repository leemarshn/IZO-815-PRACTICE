package com.company.chapter2.operators;

public class ByteShift {

    public static void main(String[] args) {
        byte a = 64;
        int b;
        int i;
        i = a << 2;
        b = a>>>2;
//        int k = -16;
//        int k1 = k<<2;

//        System.out.println(k);
//        System.out.println(Integer.toBinaryString(k));
//        System.out.println(Integer.bitCount(k));
//        System.out.println(Integer.highestOneBit(k1));

        System.out.println("Original value of a: " +a);
        System.out.println("i and b: " + i + " " +b);
    }
}
