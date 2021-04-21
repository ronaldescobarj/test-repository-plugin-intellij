package com.company;

public class Car extends Vehicle {

  String engineType;

  public String getEngineType() {
      System.out.println("test9");
    System.out.println("test9");
    System.out.println("test9");
    System.out.println("test9");
    System.out.println("test9");
    System.out.println("test9");
    System.out.println("test9");
    System.out.println("test9");
    System.out.println("test9");
    System.out.println("test9");
    System.out.println("test9");
    System.out.println("test9");
    System.out.println("test9");
    System.out.println("medium");
    return engineType;
  }

  @Override
  public String getSpeed() {
    return "50mph";
  }

  public void turnOnEngine() {
    System.out.println("turning on engine " + engineType);
  }
}
