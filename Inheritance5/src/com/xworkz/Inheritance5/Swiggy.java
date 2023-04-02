package com.xworkz.Inheritance5;

public class Swiggy extends OnlineDeliverySource {
	
	String worktype= "Food Delivery";
	String source= "Delivery Partner";
	
	public void deliver() {
		System.out.println("What Swiggy Do");
		System.out.println(worktype);
		System.out.println("who delivers it");
		System.out.println(source);
	}

}
