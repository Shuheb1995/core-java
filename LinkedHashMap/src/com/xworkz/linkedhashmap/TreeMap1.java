package com.xworkz.linkedhashmap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		
		map.put(1, "The Rock");
		map.put(2, "Undertaker");
		map.put(3, "Brock Lesner");
		map.put(4, "Roman Reigns");
		map.put(5, "Goldberg");
		map.put(6, "Jhon Cena");
		
		System.out.println(map);
		
		System.out.println("-----------------Entry Set-------------------");
		Set<Entry<Integer,String>> ent =  map.entrySet();
		for (Entry<Integer, String> entry : ent) {
			System.out.println(entry);
		}
		
		System.out.println("-----------------Size-------------------");
	    int ref = map.size();
	    System.out.println(ref);
	    
	    System.out.println("-----------------Replace-------------------");
	    boolean rplc = map.replace(1, "The Rock", "Rey Mysterio");
	    System.out.println(rplc);
	    
	    System.out.println("-----------------Last Entry-------------------");
        
	    Map.Entry<Integer, String> last = map.lastEntry();
	    System.out.println(last);
	    
	    System.out.println("-----------------Lower Key-------------------");
	    
         System.out.println(map.lowerKey(6));
         
         System.out.println("------------------Lower Entry----------------");
         
         Map.Entry<Integer, String> lwr = map.lowerEntry(5);
         System.out.println(lwr);

	}

}
