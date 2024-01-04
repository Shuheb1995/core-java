package com.xworkz.stringapti;

public class DuplicatesChar {

	public static void main(String[] args) {

		char[] chr = { 'A', 'B', 'A', 'C', 'D', 'C', 'B', 'S', 'S' ,'O','O'};

		int count = 0;
		for (int i = 0; i < chr.length; i++) {
			for (int j = i+1; j < chr.length; j++) {
				if (chr[i] == chr[j]) {
					count++;
					System.out.println("Duplicates : " +chr[j]);
				}else {
					
				}
			}

		}
		System.out.println("Duplicates are " + count);

	}

}
