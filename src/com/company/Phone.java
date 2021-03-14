package com.company;

public class Phone extends Device {
    private String simCard;

    public void callPhone(long phoneNumber) {
        System.out.println("calling phone " + phoneNumber);
    }
}
