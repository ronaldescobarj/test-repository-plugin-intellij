package com.company;

public class Calculations {
  float calculationConstant = 173;

  public int doFirstCalculation(int value) {
    return value * 100;
  }

  public int doSecondCalculation() {
    return calculationConstant * 2;
  }

  public int doThirdCalculation(int factor, int max) {
    return factor * 4 + max;
  }
}
