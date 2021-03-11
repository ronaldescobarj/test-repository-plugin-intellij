package com.company;

public class Laptop extends Device {
    private String keyboardType;

    @Override
    public void shutDown() {
        System.out.println("laptop shut down");
    }

    public void openVisualStudioCode() {
        System.out.println("opening visual studio code");
    }

    public void linkWithPhone() {
        System.out.println("linking with phone");
    }
}
