package com.xworkz.accessspecifier;

public class Journey {
	
	static String vehicle = "Car";
	private static String place = "Manaali";
	static int budget =25000;
	static int noOfDays =15;

	
	public String Destination = "Ladaak";
	private String journeyBy = "Bus";
	int expense = 30000;
	protected String journeyPeriod = "20 Days";
	
	public static void travel() {
		System.out.println("Public Access Specifier");
		System.out.println(vehicle);
		System.out.println("Private Access Specifier");
		System.out.println(place);
	}
	
	public void mayBe() {
		System.out.println(journeyBy);
	}
	
	
	

}
