package com.company;

public class Calculations {
  float calculationConstant = 173;

  public int doFirstCalculation(int value) {
    return value * 100;
  }

  public int doSecondCalculation() {
    return calculationConstant * 2;
  }

  public int doThirdCalculation(int factor) {
    int firstResult = factor * 4;
    int secondResult = firstResult + 25;
    int thirdResult = secondResult - 2;
    int fourthResult = thirdResult + 5;
    return fourthResult - 1;
  }
}
