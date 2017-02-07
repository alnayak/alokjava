package com.om;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StringSort {
	
	public static void main(String[] args) {
		
		List<String> str=new ArrayList<String>();
		str.add("Sayseha");
		str.add("Alok");
		str.add("Pupun");
		Collections.sort(str);
		
		Iterator<String> itr=str.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
		
	}

}
