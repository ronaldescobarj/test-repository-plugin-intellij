package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        int myInteger = 3;
        int a = 1;
        int b = 8;
        int result = myMath.sum(a, b);
        int x = 1;
        int y = 4;
        int product = multiply(x, y);
        int n1 = 5;
        int n2 = 4;
        int substraction = myMath.substract(n1, n2);
        int firstNumber = 10;
        int secondNumber = 5;
        int divisionResult = myMath.divide(firstNumber, secondNumber);
        String myStr = "abc";
	// write your code here
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
