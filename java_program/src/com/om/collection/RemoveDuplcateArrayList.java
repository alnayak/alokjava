package com.om.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplcateArrayList {

	public static void main(String[] args) {
		List li=new ArrayList();
		li.add("one");
		li.add("two");
		li.add("three");
		li.add("one");
		li.add("two");
		li.add("One");
		
		List li1=new ArrayList(new LinkedHashSet(li));
		Iterator it=li1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}


}
