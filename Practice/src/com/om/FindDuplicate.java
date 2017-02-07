package com.om;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		int [] abc ={1,2,3,3,5,6,4,5,1};
		
		Set set=new HashSet<>();
		for(int i=0; i<abc.length;i++){
			if(set.add(abc[i])==false){
				System.out.print(abc[i]+ ",");
			}
			System.out.println("Dupliacte ");
		}

	}

}
