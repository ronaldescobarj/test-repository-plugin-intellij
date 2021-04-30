  
package com.company;

public class Car extends Vehicle {

  @Override
  public String getSpeed() {
    return "50mph";
  }

  public void turnOnEngine() {
    System.out.println("turning on engine " + engineType);
  }
}