package com.hcl.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finput {
  /**
   * Method is used for business logic.
   * @param args to give input.
   */
  public static void main(String[] args) {
    try {
      FileInputStream fin =
          new FileInputStream("C:/hcljava/Day4/Excption/src/com/hcl/ex/Custom.java");
      int ch;
      while ((ch = fin.read()) != -1) {
        System.out.print((char)ch);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
