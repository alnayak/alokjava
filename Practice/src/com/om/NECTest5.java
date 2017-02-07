package com.om;
class Sup {
	//final int add(int a, int b) 
	 int add(int a, int b){
		return 0;
	}
}
class Sub extends Sup {
	int add(int a, int b) {
		return 1;
	}
}
public class NECTest5 {
	public static void main(String[] args) {
		Sub u = new Sub();
		u.add(0, 1);
	}
}
