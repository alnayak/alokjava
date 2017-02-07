package com.om.FactoryPattern;

public class BankFactoryMain {

	public static void main(String[] args) {
		BankFactory factory=new BankFactory();
		
		Bank bank=factory.getBank("icici");
		System.out.println(bank.rateOfIntrest());

	}

}
