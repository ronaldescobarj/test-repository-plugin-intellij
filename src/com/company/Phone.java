package com.company;

public class Phone {
    private int battery;
    private String simCard;

    public int getBattery() {
        return battery;
    }

    public void callPhone(long phoneNumber) {
        System.out.println("calling phone " + phoneNumber);
    }
}
