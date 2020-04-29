package com.company.lamdas;

public class MethodRefDemo {
    // This method has a functional interface as the type of
    // its first parameter. Thus, it can be passed any instance
    // of that interface, including a method reference.
    static String stringOp(MyFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String args[])
    {
        String inStr = "Lambdas add power to Java";
        String outStr;

        MyStringOps text = new MyStringOps();

//        outStr =  text.strReverse("Kenya");


        // Here, a method reference to strReverse is passed to stringOp().
        outStr = stringOp(text::strReverse, inStr);

        System.out.println("Original string: " + inStr);
        System.out.println("String reversed: " + outStr);
    }
}
