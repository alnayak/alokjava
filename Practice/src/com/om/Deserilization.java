package com.om;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserilization {

	public static void main(String[] args) {
		Emp b;
		try {
			FileInputStream fileInputStream = new FileInputStream(
					"C:/Users/anayak/Desktop/Alok Java Developement/Workspace/Practice/abc.txt");
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			try {
				b=(Emp)inputStream.readObject();
				System.out.println(b.i);
				System.out.println(b.s);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
