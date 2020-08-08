package com.company.lamdas;

public class LambdaDemo {

    public static void main(String[] args) {


        MyNumber MyNum;

        MyNum = () -> 123.45;

        System.out.println(MyNum.getValue());
    }
}
