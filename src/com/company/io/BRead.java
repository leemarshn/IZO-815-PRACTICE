package com.company.io;

import jdk.nashorn.internal.ir.debug.JSONWriter;

import java.io.*;

public class BRead {

    public static void main(String args[])
    {
        char c =0;
        BufferedReader br = new
                BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, 'q' to quit.");
        System.out.write(90);
        // read characters
        do {
            try {
                c = (char) br.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(c);
        } while(c != 'q');
    }

}
