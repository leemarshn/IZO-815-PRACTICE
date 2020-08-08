package com.jeanne;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

public class Chapter2Test {
    public static void main(String[] args) {

        String string = "animals";
//        System.out.println(string.charAt(7));
        System.out.println(string.length());
        System.out.println(string.substring(3,7));
        System.out.println(string.toUpperCase());
        System.out.println(string.replace("a", "7"));

    }
}
