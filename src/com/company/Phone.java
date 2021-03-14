package com.company;

public class Phone {
    private int battery;
    private String simCard;

    public void shutDown() {
        System.out.println("shutting down");
    }

    public void callPhone(long phoneNumber) {
        System.out.println("calling phone " + phoneNumber);
    }
}
