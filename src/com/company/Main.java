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

    public static void testMethod() {
      int a = 1;
      int b = 2;
      System.out.println("abc");
      int c = 3;
      int d = 4;
    }

    public static void testMethod2() {}

    public static void testMethod3() {}
}
