package com.om.collection;

public class CustomArrayList<E> {

	private static final int INITIAL_CAPACITY = 10;
	private int size = 0;
	private Object elementData[] = {};

	public CustomArrayList() {
		elementData = new Object[INITIAL_CAPACITY];
	}

	public void add(E e) {
		elementData[size++] = e;
	}	
	
	public E get(int index){
		
		return  (E)elementData[index];
		
	}
	
	public void display(){
		for(int i=0; i<size;i++){
			System.out.println(elementData[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		CustomArrayList<Integer> al=new CustomArrayList<Integer>();
		al.add(2);
		al.add(3);
		al.add(5);
		al.add(1);
		
		al.display();
	}

}
/*
2 
3 
5 
1
 */
