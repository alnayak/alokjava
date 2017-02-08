package com.om.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sayesha");
		al.add("Pupun");
		al.add("Chikuli");
		al.add("Anshuman");
		Collections.sort(al);
		for (String str : al) {
			System.out.println(str);
		}
	}
}

/*
 * Anshuman
 * Chikuli
 * Pupun
 * Sayesha
 */