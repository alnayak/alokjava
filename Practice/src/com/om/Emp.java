package com.om;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Emp implements Serializable{
	
	int i;
	String s;
	

	public Emp() {
		System.out.println("Saving");
	}


	public static void main(String[] args) {
		Emp emp=new Emp();
		emp.i=10;
		emp.s="Alok";
		
		try {
			FileOutputStream fo=new FileOutputStream("abc.ser");
		    ObjectOutputStream oo=new ObjectOutputStream(fo);
		    oo.writeObject(emp);
		    fo.close();
		    oo.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	}

}
