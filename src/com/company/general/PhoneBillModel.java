package com.company.general;

public class PhoneBillModel {

    private int id;
    private float minuteUsed;

    public PhoneBillModel(int id, float minuteUsed) {
        this.id = id;
        this.minuteUsed = minuteUsed;
    }

    public PhoneBillModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMinuteUsed() {
        return minuteUsed;
    }

    public void setMinuteUsed(float minuteUsed) {
        this.minuteUsed = minuteUsed;
    }
}
