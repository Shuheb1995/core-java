package com.xworkz.pattern;

public class Pattern6 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 3 || i == 5 || (i == 2 & j == 1) || (i == 4 & j == 5)) {
					System.out.print(" $");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 3 || j == 1 || j == 5) {
					System.out.print(" $");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 5 || j == 1 || j == 5) {
					System.out.print(" $");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 3 || j == 1 || j == 5) {
					System.out.print(" $");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 3 || i == 5 || j == 1) {
					System.out.print(" $");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i==1 || j == 1 || i==5 || (i == 3 & j <= 4) || (j==5 & i<=2) || (j==5 & i==4)) {
					System.out.print(" $");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

	}

} //j == 1 || (i == 2 & j == 5) ||  || j == 5 || i == 5 
