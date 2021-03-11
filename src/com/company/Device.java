package com.company;

public abstract class Device {
    private String brand;
    protected int battery;
    protected boolean isAndroid;

    public void format() {
        System.out.println("formatting");
    }

    public abstract void shutDown();

    public int getBattery() {
        return battery;
    }
}
