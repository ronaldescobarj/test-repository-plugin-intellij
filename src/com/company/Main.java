package com.company;

import java.util.ArrayList;

public class Main {

    @SupressWarnings("unchecked")
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        int myInteger = 9;
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
        int mod = getMod(first, second);
        String s1 = "abcd";
        String s2 = "efgh";
        String stringRes = concatStrings(s1, s2);
        String myStr = "abc";
	// write your code here
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static String concatStrings(String s1, String s2) {
      return s1 + s2;
    }

    public static int getMod(int first, int second) {
      return first % second;
    }
}
