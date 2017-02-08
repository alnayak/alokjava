package com.om.factorypattern;

public class BankFactory {
	
	
	
	public Bank getBank(String bankType){
		
		Bank bank;
		if("sbi".equals(bankType)){
			 bank=new SbiBank();
		}
		else if("icici".equals(bankType)){
			 bank=new IciciBank();
		}
		else{
			 bank=new IdbiBank();
		}
		return  bank;
	}

}
