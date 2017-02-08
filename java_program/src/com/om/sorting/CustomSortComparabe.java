package com.om.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Students implements Comparable<Students> {
	String name;
	int rollNumber;

	public Students(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}

	public int compareTo(Students st) {
		if (this.rollNumber == st.rollNumber) {
			return 0;
		} else if (rollNumber > st.rollNumber) {
			return 1;
		} else {
			return -1;
		}
	}
}

public class CustomSortComparabe {

	public static void main(String[] args) {
		Students st1 = new Students("Chinmayee", 13);
		Students st2 = new Students("Alok", 1);
		Students st3 = new Students("Jitendra", 56);
		Students st4 = new Students("Hitansu", 6);

		ArrayList<Students> ar = new ArrayList<Students>();
		ar.add(st1);
		ar.add(st2);
		ar.add(st3);
		ar.add(st4);
		Collections.sort(ar);
		Iterator<Students> it = ar.iterator();
		while (it.hasNext()) {
			Students st = (Students) it.next();
			System.out.println(st.rollNumber + " " + st.name);

		}
	}
}

/*
 * @OutPut 
 * 1 Alok 
 * 6 Hitansu 
 * 13 Chinmayee 
 * 56 Jitendra
 */
