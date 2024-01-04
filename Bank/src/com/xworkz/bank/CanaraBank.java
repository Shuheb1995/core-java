package com.xworkz.bank;

public class CanaraBank implements Bank{

	@Override
	public void deposit() {
		System.out.println("Canara Bank Account Deposited for 1000rs");
		
	}

	@Override
	public void withdarw(int amount) {
		System.out.println("Canara Bank Account Withdrawn for 2000rs");
		
	}
	
	

}
