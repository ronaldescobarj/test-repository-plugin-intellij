package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        int myInteger = 3;
        int a = 9;
        int b = 2;
        int result = myMath.sum(a, b);
        int x = 2;
        int y = 4;
        int product = multiply(x, y);
        int n1 = 5;
        int n2 = 4;
        int substraction = myMath.substract(n1, n2);
	// write your code here
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
