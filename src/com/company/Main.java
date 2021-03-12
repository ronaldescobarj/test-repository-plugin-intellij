package com.company;

import java.util.ArrayList;

public class Main {

    static float varXd = 2;
    static int renamedAttribute = 4;

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
        String s1 = "abcd";
        String s2 = "efgh";
        String stringRes = joinStrings(s1, s2);
        String myStr = "abc";
	// write your code here
    }

    public static String joinTwoStrings(String stringFirst, String s2) {
      return s1 + s2;
    }

    public static int obtainMod(int first, int second) {
      return first % second;
    }

    public static int doSomething() {
      int abc = 2;
      return 5;
    }

    public static void doSomethingXd(String a, int b, float c) {
      System.out.println("hello");
    }

    public static void doSomethingXdxd(String y, boolean x, int z) {
      System.out.println("hi");
    }
}
