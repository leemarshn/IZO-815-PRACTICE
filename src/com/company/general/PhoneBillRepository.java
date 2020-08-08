package com.company.general;

public interface PhoneBillRepository {

    int costPerMinute = 5;
    int allottedMinutes = 1500;

//    double calculateTax();
    float calculateTotalCost();
    double overrage();
    void printItemizedBill();


}
