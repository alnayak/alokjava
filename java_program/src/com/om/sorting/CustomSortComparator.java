package com.om.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Students2 {
	int rollNumber;
	String name;
	public Students2(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}
	
  
}
class StudentAge implements Comparator<Students2>{
	
	public int compare(Students2 s1, Students2 s2) {
		if(s1.rollNumber==s2.rollNumber){
			return 0;
		}else if(s1.rollNumber>s2.rollNumber){
			return 1;
		}else{
			return -1;
		}
		
	}
}

class StudentsName implements Comparator<Students2>{

	public int compare(Students2 s1, Students2 s2) {
		// TODO Auto-generated method stub
		return s1.name.compareTo(s2.name);
	}
}
public class CustomSortComparator {

	public static void main(String[] args) {
		Students2 st21 = new Students2(13, "Chinmayee");
		Students2 st22 = new Students2(1, "Alok");
		Students2 st23 = new Students2(56, "Jitendra");
		Students2 st24 = new Students2(6, "Hitansu");

		ArrayList<Students2> ar = new ArrayList<Students2>();
		ar.add(st21);
		ar.add(st22);
		ar.add(st23);
		ar.add(st24);
		System.out.println("Sort By Age.............");
		Collections.sort(ar, new StudentAge());
		Iterator<Students2> it = ar.iterator();
		while (it.hasNext()) {
			Students2 st = (Students2) it.next();
			System.out.println(st.rollNumber + " " + st.name);
		}
		System.out.println("Sort By Name.............");
		Collections.sort(ar, new StudentsName());
		Iterator<Students2> it1 = ar.iterator();
		while (it1.hasNext()) {
			Students2 st1 = (Students2) it1.next();
			System.out.println(st1.rollNumber + " " + st1.name);
		}
	}
}

/*
 * Sort By Age.............
 * 1 Alok
 * 6 Hitansu
 * 13 Chinmayee
 * 56 Jitendra
 * Sort By Name.............
 * 1 Alok
 * 13 Chinmayee
 * 6 Hitansu
 * 56 Jitendra
 * 
 */
