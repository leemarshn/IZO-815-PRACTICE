package com.company.methods;

public class ArguementPassingCallByValue {

    public static void main(String args[]) {
        ArgumentPasingTest ob = new ArgumentPasingTest();
        int a = 15, b = 20;

        System.out.println("a and b before call: " +
                a + " " + b);

        ob.meth(a, b);

        System.out.println("a and b after call: " +
                a + " " + b);
    }
}
