package com.om.collection;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

	public static void main(String[] args) {
		int arr[]={1,3,3,4,1,6,7,4,8};
		Set<Integer>  s=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++){
			if(s.add(arr[i])==false){
				System.out.println(arr[i]+" Are Duplicate Elements");
				
			}
			
		}

	}

}
