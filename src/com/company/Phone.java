package com.company;

public class Phone extends Device {
    private String simCard;
    private boolean isAndroid;

    public void shutDown() {
        System.out.println("phone shut down");
    }

    public void callPhone(long phoneNumber) {
        System.out.println("calling phone " + phoneNumber);
    }
}
