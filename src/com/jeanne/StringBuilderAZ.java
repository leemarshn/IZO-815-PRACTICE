package com.jeanne;

public class StringBuilderAZ {
    public static void main(String[] args) {
        StringBuilder alpha = new StringBuilder();
        for (char current ='a'; current<='z'; current++){
            alpha.append(current);
            System.out.println(alpha);
        }
    }
}
