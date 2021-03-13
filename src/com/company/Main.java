package com.company;

import java.util.ArrayList;
public class Main {
    static float renamedAttribute = 4;
    @SupressWarnings("unchecked")
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        int myNumberInteger = 9;
        int a = 1;
        int b = 4;
        int result = myMath.sum(a, b);
        int x = 4;
        int y = 1;
        int product = multiply(x, y);
        int n1 = 8;
        int n2 = 4;
        int substraction = myMath.substract(n1, n2);
        int firstNumber = 15;
        int secondNumber = 5;
        int divisionResult = myMath.divide(firstNumber, secondNumber);
        int first = 14;
        int second = 5;
        int mod = obtainMod(first, second);
        String s1 = "abcde";
        String s2 = "fghij";
        String stringRes = joinStrings(s1, s2);
        String myStr = "ABCDEFG";
        String myNewString = "hello";
        int numberOne = 1;
        int numberTwo = 2;
        int numberThree = 3;
        int numberResult = sumThreeNumbers(numberOne, numberTwo, numberThree);
        String text = "MyText";
    }

    public static int sumThreeNumbers(int numberOne, int numberTwo, int numberThree) {
      return numberOne + numberTwo + numberThree;
    }

    public static int obtainMod(int firstNumber, int second) {
      return firstNumber % second;
    }

    public static String joinTwoStrings(String stringFirst, String s2) {
      return s1 + s2;
    }

    public static void doSomethingXd(String a, float c, int b) {
      float x = 3;
      System.out.println("hello");
    }

    public static float doSomething() {
      return 5;
    }

    public static void doSomethingXdxd(float y, boolean x, int z) {
      System.out.println("hi");
    }
}
