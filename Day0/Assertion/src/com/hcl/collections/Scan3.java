package com.hcl.collections;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Scan3 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("c:/files/data.txt");
		fw.write("12 ram 12.5 22 6 34.5 true priya" + "false 42 1.5 221 anad prem 4.6");
fw.close();
FileReader fr = new FileReader("c:/files/data.txt");
		Scanner sc = new Scanner(fr);
		while(sc.hasNext()) {
			if( sc.hasNextInt()) {
				System.out.println(sc.nextInt());
			} else {
				sc.next();
			}
		}
		sc.close();
		fr.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
