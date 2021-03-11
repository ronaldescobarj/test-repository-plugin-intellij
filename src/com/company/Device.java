package com.company;

public abstract class Device {
    private String brand;
    protected int battery;

    public void format() {
        System.out.println("formatting");
    }

    public abstract void shutDown();
}
