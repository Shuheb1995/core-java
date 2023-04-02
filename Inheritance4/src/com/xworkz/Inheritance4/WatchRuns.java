package com.xworkz.Inheritance4;

public class WatchRuns {
	
	public static void main(String[] args) {
		
		Fastrack3121SM01 fast= new Fastrack3121SM01();
		fast.initialize();
		fast.fast();
		fast.name= "Fastrack3121SM01";
		fast.price= 1800;
		System.out.println(fast.name);
		System.out.println(fast.price);
		
		
	}

}
