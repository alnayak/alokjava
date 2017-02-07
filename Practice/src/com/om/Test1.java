package com.om;

public class Test1 extends Thread {
	
	public synchronized void printTable1(int j){
		for(int i=1;i<=5;i++){
			System.out.println("printTable1-"+i*j);
		}
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void printTable2(int j){
		for(int i=1;i<=5;i++){
			System.out.println("printTable2-"+i*j);
		}
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  void printTable3(int j){
		for(int i=1;i<=5;i++){
			System.out.println("printTable3-"+i*j);
		}
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
	
	public static void main(String[] args) {
		final Test1 obj=new Test1();
		
		Thread t1=new Thread(){
			@Override
			public void run() {
				
				obj.printTable1(1);
			}
				
			
		};
		Thread t2=new Thread(){
			@Override
			public void run() {
				obj.printTable2(10);
			}
			
		};
		
		Thread t3=new Thread(){
			@Override
			public void run() {
				obj.printTable3(100);
			}
			
		};
		
       t1.start();
       t2.start();
       //t3.start();
	}
}
