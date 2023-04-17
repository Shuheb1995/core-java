package com.xworkz.accessspecifier.Carrom;

public class CarromBoard {
	
	private static String boardName = "Sysca";
	private static int whiteCoins = 9;
	private static int blackCoins = 9;
	private static int redCoin = 1;
	
	public static void board() {
		System.out.println("calling privte AS with Public AS");
		System.out.println(boardName);
	}
	public static void coinW() {
		System.out.println("calling privte AS with Public AS");
		System.out.println(whiteCoins);
	}
	public static void coinB() {
		System.out.println("calling privte AS with Public AS");
		System.out.println(blackCoins);
	}
	public static void coinR() {
		System.out.println("calling privte AS with Public AS");
		System.out.println(redCoin);
	}

}
