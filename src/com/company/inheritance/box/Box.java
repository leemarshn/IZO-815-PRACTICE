package com.company.inheritance.box;

public class Box {
    double width;
    double height;
    double depth;

    Box (Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box() {
        width = -1;
        depth = -1;
        height = -1;
    }

    Box (double len){
        width = height = depth = len;
    }

    double volume(){
        return  width * height * depth;
    }


}
