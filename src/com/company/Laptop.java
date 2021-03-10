package com.company;

public class Laptop extends Device {
    private String keyboardType;
    private int battery;

    @Override
    public void shutDown() {
        System.out.println("laptop shut down");
    }

    public void openVisualStudioCode() {
        System.out.println("opening visual studio code");
    }
}
