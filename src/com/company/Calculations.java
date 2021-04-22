package com.company;

public class Calculations {
  int calculationConstant = 173;

  public int doFirstCalculation(float value) {
    return value * 100;
  }

  public float doSecondCalculation() {
    return calculationConstant * 2;
  }

  public int doThirdCalculation(int factor, int maxValue) {
    int firstResult = factor * 4;
    int secondResult = firstResult + 25;
    int thirdResult = secondResult - 2;
    int fourthResult = thirdResult + 5;
    int fifthResult = fourthResult  - maxValue;
    return fifthResult + 3;
  }
}
