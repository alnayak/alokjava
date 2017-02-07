package com.om;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Emp1 implements Comparable<Emp1>{
	
	String name;
	int rollNumber;
	
	public Emp1(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}
	@Override
	public int compareTo(Emp1 emp) {
		if(this.rollNumber==emp.rollNumber)
			return 0;
		else if(rollNumber>emp.rollNumber)  
			return 1;
		else
			return -1;
		
	}
	
	@Override
	public String toString() {
		return "Emp1 [name=" + name + ", rollNumber=" + rollNumber + "]";
	}
	
	
	
}

public class Employee {

	public static <T> void main(String[] args) {
		
		List empMap=new ArrayList();
		Emp1 e1=new Emp1("Guru", 7);
		Emp1 e2=new Emp1("Alok", 4);
		Emp1 e3=new Emp1("Subu", 8);
		
		empMap.add(e1);
		empMap.add(e2);
		empMap.add(e3);
		
		Collections.sort(empMap);
		System.out.println(empMap);
		
	}

}
