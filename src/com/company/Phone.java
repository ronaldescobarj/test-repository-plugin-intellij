package com.company;

public class Phone {
  private String brand;
  private String simCard;

  public void format() {
    System.out.println("formatting");
  }

  public void shutDown() {
    System.out.println("phone shut down");
  }

  public void callPhone(long phoneNumber) {
    System.out.println("calling phone " + phoneNumber);
  }
}
