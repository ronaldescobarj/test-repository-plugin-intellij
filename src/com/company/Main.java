package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      int appVersion = 1;
      String name = args[0];
      String country = args[1];
      String welcome = getWelcomeMessage(name, country);
    }

    public String getWelcomeMessage(String name, String country) {
      String hello = "Hello " + name;
      String from = "from " + country;
      return hello + from;
    }

    public static String getMenu(int userId) {
      return userId == 1 ? "Menu1" : "Menu2";
    }

    public static void showGoodbyeMessage(String name) {
      System.out.println("Goodbye " + name);
    }

    public static String showUserData(String name, int age, String country) {
      return "Name: " + name + "Country: " + country + "Age" + age;
    }

    public static String getMessageByAge(int age) {
      boolean isAdult = age > 18;
      return isAdult ? "You are an adult" : "You are not an adult";
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
