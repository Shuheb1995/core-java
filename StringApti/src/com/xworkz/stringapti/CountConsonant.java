package com.xworkz.stringapti;

public class CountConsonant {

	public static void main(String[] args) {
		
		String name = "Xworkz is an institute";
		char[] ch = name.toCharArray();
		int count = 0;
		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i] == 'a' || ch[i] =='e' || ch[i] =='i' || ch[i] =='o' || ch[i] =='u' || ch[i] ==' ') {
				
			}else {
				count++;
				System.out.print(ch[i]+",");
			}
		}
		System.out.println();
		System.out.println("Total Number of Consonant = " +count++);
		

	}

}
