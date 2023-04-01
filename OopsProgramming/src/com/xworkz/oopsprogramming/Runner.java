package com.xworkz.oopsprogramming;

public class Runner extends Car {
	
	public static void main(String[] args) {
		Car drive= new Car();
		System.out.println(drive.name);
		System.out.println(drive.price);
		System.out.println(drive.wheel);
		System.out.println(drive.cC);
		System.out.println(drive.mileage);
		
		drive.driving();
		drive.running();
		drive.journey();
		
		
		
		Swift print= new Swift("Swift ZDI",20);
		
		print.model();
		print.avgMileage();
		System.out.println("What is Model");
		System.out.println(print.name);
		System.out.println("What is Average Mileage");
		System.out.println(print.mileage);
		
		System.out.println("inherit Parent class " +print.price);
		
		
		
		Hyundai display= new Hyundai("i20","2012");
		display.name();
		display.year();
		 System.out.println("Model Name is");
		System.out.println(display.modelName);
		System.out.println("Model Year is");
		System.out.println(display.modelYear);
		
		System.out.println("inherit Parent class " +display.wheel);
		
		
		
		Toyota show= new Toyota("Fortuner",4500000);
		show.name();
		show.fixedPrice();
		System.out.println("Model Name is");
		System.out.println(show.modelname);
		 System.out.println("Model Price is");
		System.out.println(show.price);
		
		System.out.println("inherit Parent class " +show.cC);
		
	}

}
