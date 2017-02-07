package com.om;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Empo implements Comparable{
	
	String name;
	int age;
	public Empo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		Empo e=(Empo)o;
		if(this.age==e.age){
			return 0;
		} else if(this.age>e.age){
			return 1;
		} else{
			return -1;
		}
		
	}
	@Override
	public String toString() {
		return "Empo [name=" + name + ", age=" + age + "]";
	}
	
		
	
	
}
public class EmpSort {

	public static void main(String[] args) {
		
		List<Empo> st = new ArrayList<Empo>();
		Empo emp1=new Empo("Sayesha", 1);
		Empo emp2=new Empo("Alok", 35);
		Empo emp3=new Empo("Pupun", 11);
		st.add(emp1);
		st.add(emp2);
		st.add(emp3);
		Collections.sort(st);
		
		System.out.println(st);
		
		
	}

}
