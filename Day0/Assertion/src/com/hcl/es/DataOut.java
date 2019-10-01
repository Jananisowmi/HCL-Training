package com.hcl.es;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOut {
  /**
   * method for read this file.
   * @param args to add 2 Numbers.
   */
  public static void main(String[] args) {
    DataOutputStream dout;
    try {
      dout = new DataOutputStream(new FileOutputStream("c:/files/data.txt"));
      dout.write(12);
      dout.writeUTF("HCL");
      dout.writeDouble(58664.6);
      dout.writeBoolean(true);
      dout.close();
      System.out.println("**File created**");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } 
  }

}
