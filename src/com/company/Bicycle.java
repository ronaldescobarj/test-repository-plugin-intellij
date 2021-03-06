package com.company;

public class Bicycle implements Vehicle {

  public String getSpeed() {
    String bicycleSpeed = "Bicycle speed";
    return bicycleSpeed;
  }

  public void pedal() {
    System.out.println("now pedaling");
  }
}
