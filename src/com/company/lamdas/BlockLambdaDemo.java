package com.company.lamdas;

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc  factorial;

        factorial = n -> {
            int result = 1;

            for(int i=1; i <= n; i++)
                result = i * result;

            return result;
        };

        System.out.println("The factoral of 3 is " + factorial.func(3));
        System.out.println("The factoral of 5 is " + factorial.func(5));
        System.out.println("The Same using method " + factoring(30));
    }
    public static int factoring(int n){
        int result = 1;

        for(int i=1; i <= n; i++)
            result = i * result;

        return result;
    };



}
