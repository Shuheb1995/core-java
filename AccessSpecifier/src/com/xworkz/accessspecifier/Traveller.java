package com.xworkz.accessspecifier;

public class Traveller {
	
	static void travelling() {
		System.out.println("Default Access Specifier");
		System.out.println(Journey.budget);
	}
	
	protected static void getCar() {
		System.out.println("Protected Specifier");		
		System.out.println(Journey.noOfDays);
	}

}
