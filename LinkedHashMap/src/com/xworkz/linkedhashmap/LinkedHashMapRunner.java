package com.xworkz.linkedhashmap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapRunner {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> lhs = new LinkedHashMap<Integer,String>();
		
		lhs.put(1, "Sprite");
		lhs.put(2, "7Up");
		lhs.put(3, "Mountain Dew");
		lhs.put(4, "Sting");
		lhs.put(5,"Mirinda");
		lhs.put(6, "Pepsi");
		lhs.put(7, "Slice");
		lhs.put(8, "Maza");
		
		
		System.out.println(lhs);
		
		System.out.println("----------Contains Value----------------");
		
		boolean bln = lhs.containsValue("RedBull");
		System.out.println(bln);
		
		System.out.println("----------Key Set----------------");
		
		Set<Integer> set = lhs.keySet();
		for (Integer i : set) {
			System.out.println(i);
		}
		
		System.out.println("----------Values   ------------");
		
		Collection<String> clcn = lhs.values();
		System.out.println(clcn);
		
		System.out.println("----------Clear----------------");
		
		lhs.clear();
		System.out.println(lhs);
		
		
		
	}

}
