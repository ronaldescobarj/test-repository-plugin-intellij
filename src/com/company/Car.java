package com.company;

public class Car implements Vehicle {

  @Override
  public String getSpeed() {
    return "Car speed";
  }

  public void checkGps() {
    System.out.println("gps works");
  }
}
