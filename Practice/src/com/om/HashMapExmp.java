package com.om;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExmp {

	public static void main(String[] args) {
		Map<Integer, String> mp=new TreeMap<Integer, String>();
		mp.put(1, "Sayseha");
		mp.put(11, "Pupun");
		mp.put(40, "Ashok");
		mp.put(35, "Bunu");
		for(Map.Entry m:mp.entrySet()){
			System.out.println("Key : "+m.getKey()+" - Value :: "+m.getValue());
		}
		

	}

}
