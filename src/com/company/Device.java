package com.company;

public abstract class Device {
    private String brand;

    public void format() {
        System.out.println("formatting");
    }

    public abstract void shutDown();
}
