package com.company.classes;

public class BoxVolume {

    public static void main(String[] args) {
        Box mybox = new Box();

//        double vol;

//        mybox.height=3.4;
//        mybox.length=7.6;
//        mybox.width=6.0;

//        vol = mybox.volume();

        mybox.setDim(23, 43, 16);


        System.out.println("The volumee is " + mybox.volume());
    }
}
