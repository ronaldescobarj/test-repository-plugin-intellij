package com.company;

public abstract class Device {
    private String brand;
    protected int battery;
    private int ramInGB;

    public void format() {
        System.out.println("formatting");
    }

    public abstract void shutDown();

    public int getBattery() {
        return battery;
    }
}
