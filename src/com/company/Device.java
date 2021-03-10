package com.company;

public abstract class Device {
    private String brand;
    private int battery;

    public void format() {
        System.out.println("formatting");
    }

    public abstract void shutDown();
}
