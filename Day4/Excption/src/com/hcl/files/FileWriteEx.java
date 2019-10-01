package com.hcl.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
  /**
   * Method is used for business logic.
   * @param args to give input.
   */
  public static void main(String[] args) {
File src,tar;
FileReader fr;
FileWriter fw;
src = new File ("C:/hcljava/Day4/Excption/src/com/hcl/ex/Custom.java");
tar = new File ("C:/files/custom.java");
try {
fr = new FileReader(src);
fw = new FileWriter(tar);
int ch;
while((ch = fr.read()) != -1) {
fw.write((char)ch);
}
fr.close();
fw.close();
System.out.println("*** File Copied ***");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		}
		
	}

}
