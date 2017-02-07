package com.om;
public class NECTest4 {
	public static void main(String[] args) {
		String s = "Alok Nayak";
		String s1 = new String("Alok Nayak");
		if (s.hashCode() == s1.hashCode()) {
			System.out.println("hasCode Equal");
		} else {
			System.out.println("hasCode Code not Equal");
		}
	}

}
