package com.hcl.es;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {
  /**
   * method for read this file.
   * @param args used to add two numbers.
   */
  public static void main(String[] args) {
    int a;
    int b;
    int c;
    System.out.println("Enter 2 Nos");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      a = Integer.parseInt(br.readLine());
      b = Integer.parseInt(br.readLine());
      c = a + b;
      System.out.println("Sum is " + c);
    } catch (NumberFormatException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
