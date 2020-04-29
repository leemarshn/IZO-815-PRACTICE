package com.jeanne;

public class StringBuilderCapacity {


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int sm = sb.indexOf("ls");
        int len = sb.length();
        char ch = sb.charAt(6);
//        System.out.println(sub + " " + len + " " + ch);
//        System.out.println(sm);

        StringBuilder sb1 = new StringBuilder("abcdef");
        sb1.delete(1, 3);
        sb1.deleteCharAt(3);
        sb1.reverse();
        System.out.println(sb1);



    }
}
