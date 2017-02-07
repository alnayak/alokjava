package com.om;

public class CustomerService {
	
	public void findByName(String name) throws NameException {
		
		if("".equals(name)){
			throw new NameException("Name should not be Blank");
		}
		else{
			System.out.println("Welcome to "+name);
		}
		
	}
	
	public static void main(String[] args) {
		
		CustomerService cust=new CustomerService();
		try {
			cust.findByName("");
		} catch (NameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
