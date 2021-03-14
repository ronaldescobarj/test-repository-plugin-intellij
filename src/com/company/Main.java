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

    public static String getMenu(int userId) {
      return userId == 1 ? "Menu1" : "Menu2";
    }

    public static void showGoodbyeMessage(String name) {
      System.out.println("Goodbye!");
      System.out.println("Have a great day");
      System.out.println(name);
      System.out.println("I hope to see you soon");
    }

    public static String showUserData(String name, int age, String country) {
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

    public static void testMethod3() {}

}
