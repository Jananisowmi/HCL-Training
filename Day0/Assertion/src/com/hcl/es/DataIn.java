package com.hcl.es;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataIn {
  /**
   * method for read this file.
   * @param args to add 2 Numbers.
   */
  public static void main(String[] args) {
    try {
      DataInputStream din = new DataInputStream(new FileInputStream("c:/files/data.txt"));
      int x = din.readInt();
      x++;
      System.out.println("X value "  + x);
      String name = din.readUTF();
      System.out.println("Name" + name);
      double bas = din.readDouble();
      System.out.println("Basic" + bas);
      boolean flag = din.readBoolean();
      System.out.println("Flag" + flag);
      din.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
