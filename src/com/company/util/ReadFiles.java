package com.company.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class ReadFiles {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fin	=	new	FileReader("/home/oracle/IdeaProjects/IZO-815-PRACTICE/src/com/basicMaths.csv");
        Scanner src	=	new	Scanner(fin);

        double sum = 0;
        int count =0;

        DoubleSummaryStatistics num2 = new DoubleSummaryStatistics();
        double average = num2.getAverage();

        while (src.hasNext()){
            if (src.hasNextDouble()) {
                Integer num = src.nextInt();

                sum += src.nextDouble();

            }
        }
        System.out.println(sum);
    }

}
