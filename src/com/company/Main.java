package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int myInteger = 3;
        int a = 9;
        int b = 2;
        int result = sum(a, b);
        int x = 2;
        int y = 4;
        int product = multiply(x, y);
        int n1 = 5;
        int n2 = 4;
        int substraction = MyMath.substract(n1, n2);
	// write your code here
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
