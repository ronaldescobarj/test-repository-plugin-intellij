package com.company;

public class MyMath {
  public int substract(int n1, int n2) {
    return mySubstract(n1, n2);
  }

  private int mySubstract(int n1, int n2) {
    return n1 - n2;
  }

  public int sum(int a, int b) {
    return mySum(a, b);
  }

  private int mySum(int a, int b) {
    return a + b;
  }

  public int divide(int firstNumber, int secondNumber) {
    return firstNumber / secondNumber;
  }
}
