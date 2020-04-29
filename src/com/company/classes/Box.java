package com.company.classes;

import sun.print.DialogOwner;

public class Box {
    Double width;
    Double length;
    Double height;

    double volume(){
        return  (width*height*length);
    }

    void setDim(double w, double l, double h){
        width = w;
        height = h;
        length = l;
    }

}
