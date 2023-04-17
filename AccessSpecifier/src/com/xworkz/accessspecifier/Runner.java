package com.xworkz.accessspecifier;

public class Runner {

	public static void main(String[] args) {
		
		Journey.travel();
		Traveller.travelling();
		Traveller.getCar();
		
		Journey journ = new Journey();
		System.out.println(journ.Destination);
		journ.mayBe();
		System.out.println(journ.expense);
		System.out.println(journ.journeyPeriod);

	}

}
