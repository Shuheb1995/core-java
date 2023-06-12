package com.xworkz.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparators {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Iron Man");
		list.add("Captain America");
		list.add("Thor");
		list.add("Hulk");
		list.add("Black Widow");
		list.add("Hawk Eye");
		list.add("Spider Man");
		list.add("Falcon");
		list.add("Winter Soldier");
		list.add("Ant Man");
		list.add("Black Panther");
		list.add("Scarlett Witch");
		list.add("Vision");
		list.add("Dr.Strange");
		list.add("Captain Marvel");
		list.add("Pietro");
		list.add("Quill");
		list.add("Rocket");
		list.add("Groot");
		list.add("War Machine");
		
		
		Comparator<String> comp = new Comparator<String>() {
			

//			@Override
//			public int compare(String s1,String s2) {
//				if(s1.length()>s2.length()) {
//					return 1;
//				}else {
//					return -1;
//				}
//			}
			

			@Override
			public int compare(String o1, String o2) {
				if(o1.charAt(1)>o2.charAt(1)) {
					return 1;
				}else {
					return-1;
				}
			}
			
		};
			
		
		 Collections.sort(list, comp);;
            for (String string : list) {
				System.out.println(string);
			}
            
          
          
		
		
		
		
		
	}
	
    
}
