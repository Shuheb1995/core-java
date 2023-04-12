package com.xworkz.arrayloop;

public class LiteralsNew {
	
	public static void main(String[] args) {
		
		String[] animal = new String[10];
		String[] birds = new String[15];
		int[] noOfBikes = new int[20];
		int[] noOfBooks = new int[12];
		int[] noOfStudents = new int[9];
		
		System.out.println(animal[5]);
		System.out.println(birds[12]);
		System.out.println(noOfBikes[15]);
		System.out.println(noOfBooks[9]);
		System.out.println(noOfStudents[6]);
		
		String[] animals = {"Elephant","Lion","Tiger","Deer","Giraffe","Rabbit","Bear","Wolf"};
		String[] bollyActors = {"Hrithik","Salman Khan","Sharukh KHan","Saifali Khan","Akshay Kumar"};
		int[] buildings = {1,2,3,4,5,6,7,8,9};
		int[] humans = {11,22,33,44,55,66,77,88,99};
		int[] even = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,7,18,19,20};
		
		for(int i=0;i<buildings.length;i++) {
			if(buildings[i] %2!=0) {
				System.out.println(buildings[i]);
			}
		}
		for(int i=humans.length-1;i>=0;i--) {
			if(humans[i] %2!=0) {
				System.out.println(humans[i]);
			}
		}
		for(int i=0;i<even.length;i++) {
			if(even[i] %2==0) {
				System.out.println(even[i]);
			}
		}
	}

}
