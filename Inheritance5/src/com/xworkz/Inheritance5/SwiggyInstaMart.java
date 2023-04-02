package com.xworkz.Inheritance5;

public class SwiggyInstaMart extends Swiggy {
	
	String work= "Delivers Groceries and etc";
	boolean deliverCharges= true;
	
	public void delivered() {
		System.out.println("what is SwiggyInstaMarts work");
		System.out.println(work);
		System.out.println("Is there any Delivery Charges");
		System.out.println(deliverCharges);
	}

}
