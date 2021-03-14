package com.company;

public class AgeVerifier {
  public static String msg(int a) {
    boolean ad = a > 18;
    return ad ? "You are an adult" : "You are not an adult";
  }
}
