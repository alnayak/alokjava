package com.om;

public class OneInstance {

	private static OneInstance one;
	
	private OneInstance(){
		System.out.println("One Instance");
	}
	
	public static OneInstance getInstance(){
		if(one == null){
			synchronized(OneInstance.class){
				if(one == null){
					one =new OneInstance();
				}
			}
		}
		
		return one;
	}
	
}

class main {
	
	public static void main(String args[]) {
		Thread th1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				OneInstance one1=OneInstance.getInstance();
			}
		});
		
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				
				OneInstance one2 =OneInstance.getInstance();
			}
		});
		
		th1.start();
		th2.start();
		
		
	}
}