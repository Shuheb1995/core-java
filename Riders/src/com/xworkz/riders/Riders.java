package com.xworkz.riders;

import java.util.HashMap;
import java.util.Set;

public class Riders {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(101, "Narain Karthikeyan");
		map.put(102, "Gaurav Gill");
		map.put(103, "Aditya Patel");
		map.put(104, "Sailesh Bolisetti");
		map.put(105, "Armaan Ibrahim");
		map.put(106, "Karun Chandhok");
		map.put(107, "Jehan Daruwala");
		
		Set<Integer> set = map.keySet();
		for(Integer integer : set) {
			System.out.println(map.get(integer));
		}

	}

}
