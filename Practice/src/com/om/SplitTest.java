package com.om;

public class SplitTest {

	static String str="[\"SALT\",\"ENDO\"]";
	public static void main(String[] args) {
		
		str = str.substring(1, str.length()-1);
		//System.out.println(str);
		
		String [] str1 = str.split(",");
		for (int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]);
			
		}
		
		
	}

}
