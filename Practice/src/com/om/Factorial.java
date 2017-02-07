package com.om;

public class Factorial {

	static int fact(int i){
		if(i==1)
			return 1;
		int j=fact(i-1)*i;
		return j;
	}
	public static void main(String[] args) {
	
        System.out.println(fact(4));
	}

}
