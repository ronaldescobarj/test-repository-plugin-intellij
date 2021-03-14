package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      int appVersion = 1;
      String name = args[0];
      String country = args[1];
      String hello = "Hello " + name;
      String from = "from " + country;
      String welcome = hello + from;
    }

    public static void showUserData(String name, int age, String country) {
      System.out.println("Name: " + name + "Country: " + country + "Age" + age);
    }

    public static String msg(int a) {
      boolean ad = a > 18;
      return ad ? "You are an adult" : "You are not an adult";
    }

    public static void testMethod() {
      int a = 123;
      int b = 2;
      int c = 3;
      int d = 4;
      int e = 5;
      System.out.println("abc");
    }

    public static void testMethod3() {}
}
