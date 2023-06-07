package com.xworkz.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HahSetRunner {
	
	public static void main(String[] args) {
		
		
		HashSet<String> emiway=new HashSet<String>();
		LinkedHashSet<String> singers= new LinkedHashSet<String>();
		
		emiway.add("Machayenge");
		emiway.add("Bad Munda");
		emiway.add("Company");
		emiway.add("Samaj Me Aya Kya");
		emiway.add("Machayenge");
		emiway.add("Jamaica to India");
		emiway.add("Chusamba");
		emiway.add("Giraftaar");
		emiway.add("Company");
		emiway.add("Freeverse FEAST");
		
		
		for (String string : emiway) {
			System.out.println(string);
		}
		System.out.println("-----------------------------------------");
		
		
		singers.add("Emiway Bantai");
		singers.add("Pitbull");
		singers.add("Eminem");
		singers.add("Pitbull");
		singers.add("Enrique Iglesias");
		singers.add("Atif Aslam");
		singers.add("Eminem");
		singers.add("Arjit Singh");
		singers.add("Jubin Nautiyal");
		
		for (String string : singers) {
			System.out.println(string);
		}
	}
}









