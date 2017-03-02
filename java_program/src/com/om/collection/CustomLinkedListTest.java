package com.om.collection;

public class CustomLinkedListTest {
	
	public static CustomLinkedList cLi;

	public static void main(String[] args) {
		
		 cLi=new CustomLinkedList();
		 cLi.add("Alok");
		 cLi.add("Guru");
		 cLi.add("Pupun");
		 cLi.add("Isha");
		 
		 System.out.println(cLi);
		 System.out.println(cLi.get(2));
		 System.out.println(cLi.size());

	}

}
