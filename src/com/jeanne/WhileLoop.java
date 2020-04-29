package com.jeanne;

public class WhileLoop {
    int roomInBelly = 6;
    public void eatCheese(int bitesOfCheese) {
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese + " pieces of cheese left");
    }

    public static void main(String[] args) {
        WhileLoop snoopy = new WhileLoop();
        snoopy.eatCheese(11);
    }
}
