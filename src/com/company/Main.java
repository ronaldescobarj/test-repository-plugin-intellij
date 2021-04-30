package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      float appVersion = 1;
      String name = args[0];
      String country = args[1];
      String welcome = getWelcomeMessage(name, country);
    }

    public static String getWelcomeMessage(String name, String country) {
        String hello = "Hello " + name;
        String from = "from " + country;
        return hello + from;
    }

    public static void showUserData(String name, String country, int age) {
      System.out.println("Name: " + name + "Country: " + country + "Age" + age);
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