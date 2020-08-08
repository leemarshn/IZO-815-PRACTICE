package com.company.arrays;

import java.util.Scanner;

public class Grades {

    private static int[] grades;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many grades would you like to Enter?");
        grades = new int[scanner.nextInt()];
        getGrades();

        System.out.println("Average: " + String.format("%.2f", averageSum()));
        System.out.println("Highest Score: " + getHighestScore());
        System.out.println("lowest Score: " + getLowestScore());

    }

    private static String getSubject(int i){
        String[] units = {"Java 11", "Algorithm Design", "Design Patterns", "Data Structures", "Discrete Maths"};
        String unit = units[0];
            unit=units[i];

        return unit;
    }

    private static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter Grade for " + getSubject(i) + (i + 1));
            grades[i] = scanner.nextInt();
        }
    }

    private static int calculateSum() {
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;

        }
        return sum;
    }

    private static double averageSum() {
        return calculateSum() / grades.length;
    }

    private static int getHighestScore() {
        int highestScore = grades[0];
        for (int grade : grades) {
            if (grade > highestScore) {
                highestScore = grade;
            }
        }
        return highestScore;
    }

    private static  int getLowestScore(){
        int lowestScore = grades[0];
        for (int grade: grades){
            if (grade < lowestScore){
                lowestScore = grade;
            }
        }

        return lowestScore;
    }
}
