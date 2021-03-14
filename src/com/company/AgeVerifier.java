package com.company;

public class AgeVerifier {
  public static String getMessageByAge(int age) {
    boolean isAdult = age > 18;
    return isAdult ? "You are an adult" : "You are not an adult";
  }
}