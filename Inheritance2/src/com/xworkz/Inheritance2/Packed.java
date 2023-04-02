package com.xworkz.Inheritance2;

public class Packed {
	public static void main(String[] args) {
		
		
		
		
		Onion on= new Onion();
		on.size= "Large";
		on.pricePerKg= 50;
		System.out.println(on.size);
		System.out.println(on.pricePerKg);
		on.packIt();
		
		
		on.install();
	
		
	}

}
