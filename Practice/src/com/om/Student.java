package com.om;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student{
	
	int rollNumber;
	int age;
	String name;
	

	public Student(int rollNumber, int age, String name) {
		super();
		this.rollNumber = rollNumber;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", age=" + age + ", name="
				+ name + "]";
	}

	}

class AgeComapre implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student st1=(Student)o1;
		Student st2=(Student)o2;
	    if(st1.name==st2.name)
		return 0;
	    else if(st1.age>st2.age)
	    	return 1;
	    else
	    	return -1;
	}

}
   
class NameCompare implements Comparator<Student>{

	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o1.name);
	}

	
}
   class MainTest{
	   public static void main(String[] args) {
		List li=new ArrayList<>();
		Student st1=new Student(3, 2, "Alok");
		Student st2 = new Student(4, 56, "Guru");
		Student st3 = new Student(1, 34, "Band");
		
		li.add(st1);
		li.add(st2);
		li.add(st3);
		Collections.sort(li, new AgeComapre());
		System.out.println(li);
		System.out.println("===========================");
		Collections.sort(li, new NameCompare());
		System.out.println(li);
	}
   }