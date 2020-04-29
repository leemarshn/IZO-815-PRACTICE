package com.company.enumsAndautoBoxing;

public class EnumDemo {

    public static void main(String args[]) {
        Apple ap;

        ap = Apple.RedDel;

        Apple allApples[] = Apple.values();

        System.out.println(allApples.length);

        ap	=	Apple.valueOf("LeeN");

        // Output an enum value.
        System.out.println("Value of ap: " + ap);
        System.out.println();

//        ap = Apple.GoldenDel;

        // Compare two enum values.
        if (ap == Apple.GoldenDel)
            System.out.println("ap contains GoldenDel.\n");

        // Use an enum to control a switch statement.
        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan is red.");
                break;
            case GoldenDel:
                System.out.println("Golden Delicious is yellow.");
                break;
            case RedDel:
                System.out.println("Red Delicious is red.");
                break;
            case Winesap:
                System.out.println("Winesap is red.");
                break;
            case Cortland:
                System.out.println("Cortland is red.");
                break;
        }
    }
}
