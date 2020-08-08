package com.company.general;

public class PhoneBillMain {

    public static void main(String[] args) {
        PhoneBillModel phoneModel = new PhoneBillModel();
        phoneModel.setId(6494);
        phoneModel.setMinuteUsed(285);
        System.out.println(phoneModel.getMinuteUsed());

        PhoneBillCalculator phoneBillCalculator = new PhoneBillCalculator();
        phoneBillCalculator.calculateTotalCost();
        phoneBillCalculator.printItemizedBill();
    }
}
