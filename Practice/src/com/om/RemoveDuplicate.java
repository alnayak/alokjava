package com.om;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		List<String> li=new ArrayList<String>();
		li.add("Five");
		li.add("One");
		li.add("Five");
		li.add("Five");
		li.add("One");
		
		List<String> list=new ArrayList<String>(new LinkedHashSet<String>(li));
		/*Iterator<String> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		*/
		
		for(String str:list){
			System.out.println(str);
		}
		

	}

}
