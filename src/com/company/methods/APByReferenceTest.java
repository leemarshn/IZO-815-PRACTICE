package com.company.methods;

public class APByReferenceTest {
    int a, b;

    APByReferenceTest(int i, int j) {
        a = i;
        b = j;
    }

    double div(APByReferenceTest o){
        return o.a % o.b;
    }

    // pass an object
    void meth(APByReferenceTest o) {
        APByReferenceTest div = new APByReferenceTest(10, 15);
        o.a *=  2;
        o.b /= 2;

        System.out.println("Crazy test" +div(div));

    }
}
