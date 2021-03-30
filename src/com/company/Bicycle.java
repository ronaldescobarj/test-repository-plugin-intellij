package com.company;

public class Bicycle extends Vehicle {

  public String getSpeed() {
    System.out.println("getting speed");
    return "10mph";
  }

  public void pedal() {
    System.out.println("now pedaling");
    System.out.println("test");
    System.out.println("test2");
  }
}

