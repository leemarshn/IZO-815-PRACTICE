package com.exceptions2;



// This program contains an error and will not compile.
class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwOne.");
        throw new IllegalAccessException("message");
    }
    public static void main(String args[]) throws IllegalAccessException {
        throwOne();
    }
}

