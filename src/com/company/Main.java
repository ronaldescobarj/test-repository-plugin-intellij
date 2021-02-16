package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        int myInteger = 4;
        int a = 1;
        int b = 8;
        int result = myMath.sum(a, b);
        int x = 1;
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
        int mod = getMod(first, second);
        String myStr = "abc";
	// write your code here
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int getMod(int first, int second) {
      return first % second;
    }
}
