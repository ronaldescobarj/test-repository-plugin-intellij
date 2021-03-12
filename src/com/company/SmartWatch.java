package com.company;

public class SmartWatch extends Device {
    private boolean isAndroid;
    private int ramInGB;

    public void shutDown() {
        System.out.println("smart watch shut down");
    }

    public void linkWithPhone() {
        System.out.println("linking with phone");
    }
}
