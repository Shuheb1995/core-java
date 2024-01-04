package com.xworkz.bank;

public class SbiBank implements Bank{

	@Override
	public void deposit() {
		System.out.println("Money Deposited in SBI Bank");
		
	}

	@Override
	public void withdarw(int amount) {
		System.out.println("Money withdrawn from SBI bank");
		
	}

}
