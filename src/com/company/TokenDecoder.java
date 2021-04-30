package com.company;

public class TokenDecoder {
  public String decodeToken(String token) {
    return "token decoded";
  }

  public String requestNewToken() {
    System.out.println("requesting new token");
  }

  public String clearToken() {
    System.out.println("clearing token");
  }
}