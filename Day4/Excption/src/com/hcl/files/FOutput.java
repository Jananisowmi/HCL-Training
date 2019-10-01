package com.hcl.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class FOutput {
  /**
   * Method is used for business logic.
   * @param args to give input.
   */
  public static void main(String[] args) {
    FileInputStream src;
    FileOutputStream tar;
    try {
      src = new FileInputStream("C:/hcljava/Day4/Excption/src/com/hcl/ex/Custom.java");
      tar = new FileOutputStream("C:/files/custom.java");
      int ch;
      while ((ch = src.read()) != -1) {
        tar.write((char)ch);
      }
      src.close();
      tar.close();
      System.out.println("*** File Copied ***");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
