package com.xworkz.collections;

import java.util.ArrayList;

public class CollectionsRunner {
	
	public static void main(String[] args) {
		
		ArrayList<String> car = new ArrayList<String>();
		
		car.add("Hyundai");
		car.add("Hyundai i10");
		car.add("Hyundai i20");
		car.add("Hyundai Creta");
		car.add("Hyundai Venue");
		car.add("Toyota Fortuner");
		car.add("Toyota Innova");
		car.add("Toyota Etios");
		car.add("Toyota Qualis");
		car.add("Toyota Cruiser");
		car.add("Renault Duster");
		car.add("Renault Kwid");
		car.add("Renault Kiger");
		car.add("TATA Indica");
		car.add("TATA Harrier");
		car.add("TATA Safari");
		car.add("TATA Altroz");
		car.add("TATA Tiago");
		car.add("Mahindra Scorpio");
		car.add("Mahindra XUV");
		
		System.out.println(car.toString());
		
		System.out.println("------Removing by Index-------");
		
		car.remove(0);
		car.remove(7);
		car.remove(9);
		car.remove(10);
		car.remove(11);
		System.out.println(car.toString());
		
		System.out.println("------Adding by Index-------");
		
		car.add(0, "Mustang");
		car.add(7, "Range Rover");
		car.add(9, "Lamborgini");
		car.add(10, "Ferrari");
		car.add(11, "BMW");
		System.out.println(car.toString());
		
		System.out.println("------Getting Elements-------");
		
		System.out.println(car.get(0));
		System.out.println(car.get(7));
		System.out.println(car.get(9));
		System.out.println(car.get(10));
		System.out.println(car.get(11));
		System.out.println(car.get(2));
		System.out.println(car.get(5));
		System.out.println(car.get(9));
		System.out.println(car.get(10));
		System.out.println(car.get(19));
		
		System.out.println("-------Setting Elements-------");
		
		System.out.println(car.set(1, "Land Rover"));
		System.out.println(car.set(6, "Lambo"));
		System.out.println(car.set(8, "Bugati"));
		System.out.println(car.set(12, "Mustang"));
		System.out.println(car.set(14, "Mercedes"));
		System.out.println(car.set(16, "BMW S"));
		System.out.println(car.set(18, "Kia"));
		System.out.println(car.set(3, "Avenza"));
		System.out.println(car.set(2, "Maruti 800"));
		System.out.println(car.set(5, "Maruti Suzuki OMNI"));
		
		System.out.println(car.toArray());  //Using toArray()
		
		
		
	}

}











