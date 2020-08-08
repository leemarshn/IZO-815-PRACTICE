package com.company.general;

public class PhoneBillCalculator implements PhoneBillRepository {

    private PhoneBillModel phoneBill = new PhoneBillModel();

    float minutesUsed = phoneBill.getMinuteUsed();

//    @Override

//    public double calculateTax() {
//        double tax = calculateTotalCost()*0.16;
//        return tax;
//    }



    @Override
    public float calculateTotalCost() {

        float totalCost = phoneBill.getMinuteUsed() * costPerMinute;
        return totalCost;

    }

    @Override
    public double overrage() {
        double overage = 0;
        if(phoneBill.getMinuteUsed() <= allottedMinutes){
           overage = phoneBill.getMinuteUsed() - allottedMinutes;
        };

        return overage;

    }

    @Override
    public void printItemizedBill() {

        System.out.println("ID: " + phoneBill.getId() + " Allotted Minutes: " + allottedMinutes + " Minutes Used: " + minutesUsed + " Overage: " + overrage() + " TotalCost: " + calculateTotalCost());

    }
}
