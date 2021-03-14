package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      int appVersion = 1;
      String name = args[0];
      String country = args[1];
      String age = age[2];
      String welcomeMessage = "Hello " + name " from " + country + " who is " + age + "years old!";
    }

    public static String getMenu() {
      return "Menu";
    }

    public static void showGoodbyeMessage(String name) {
      System.out.println("Goodbye " + name);
    }

    public static String showUserData(String country, String name, String age) {
      return "Name: " + name + "Country: " + country + "Age" + age;
    }

    public static String msg(int a) {
      boolean ad = a > 18;
      return ad ? "You are an adult" : "You are not an adult";
    }

    public static void testMethod() {
      int a = 2;
      int b = 3;
      int c = 4;
      System.out.println("abc");
      int d = 5;
    }

    public static void testMethod2() {}

}
