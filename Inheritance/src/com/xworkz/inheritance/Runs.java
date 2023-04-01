package com.xworkz.inheritance;

public class Runs {
	
	public static void main(String[] args) {
		
		
		Bike bike= new Bike();
		bike.run();
		bike.brand= "YAMAHA";
		bike.model= "R1";
		
		System.out.println(bike.brand);
		System.out.println(bike.model);
		
		Car car= new Car();
		car.runs();
		car.brand= "MUSTANG";
		car.model= "GT";
		
		System.out.println(car.brand);
		System.out.println(car.model);
		
	}

}
