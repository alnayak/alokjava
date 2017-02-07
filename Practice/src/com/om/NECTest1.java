package com.om;

import java.util.HashMap;
import java.util.Map;

public class NECTest1 {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "One");
		m.put(2, "Two");
		m.put(3, "Three");
		m.put(1, "ONE");
		m.put(null, "null");
		String str = "Alok";
		m.put(null, str);
		System.out.println(m.size());
		System.out.println(m.get(1));
		System.out.println(m.get(null));
	}
}
