package com.om;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterCount {
	static void getCharCount(String input) {
		String str = input;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
		}

		for (int i = 0; i < str.length(); i++) {
			int elementCount = 0;
			for (Character character : list) {
				if (character.equals(str.charAt(i))) {
					elementCount++;
				}
			}
			map.put(str.charAt(i), elementCount);
		}
		System.out.println("Number of Occurance of the Number ...:" + map.toString());
	}

	public static void main(String[] args) {
		CharacterCount.getCharCount("1212234");
		CharacterCount.getCharCount("1,2,1,2,2,3,4");
		
		CharacterCount.getCharCount("A,B,B,A,C,A,B");
	}

}
