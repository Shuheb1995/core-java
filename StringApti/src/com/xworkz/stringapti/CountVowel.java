package com.xworkz.stringapti;

public class CountVowel {

	public static void main(String[] args) {

		String name = "Xworkz is an institute";
		char[] ch = name.toCharArray();
		int count = 0;
		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i] == 'a' || ch[i] =='e' || ch[i] =='i' || ch[i] =='o' || ch[i] =='u') {
				count++;
				System.out.print(ch[i]+",");
			}else {
				
			}
		}
		System.out.println();
		System.out.println("Total  number of Vowels = " + count);
	}

}
