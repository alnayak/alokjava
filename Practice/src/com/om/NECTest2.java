package com.om;

import java.util.Set;
import java.util.TreeSet;
public class NECTest2 {
	public static void main(String[] args) {
		Set<Integer> ts=new TreeSet<>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(1);
		System.out.println(ts);
	}
}
