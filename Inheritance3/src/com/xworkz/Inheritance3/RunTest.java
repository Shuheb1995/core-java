package com.xworkz.Inheritance3;

public class RunTest {
	
	public static void main(String[] args) {
		
		Apple app= new Apple();
		app.type= "Kashmiri Apple";
		app.cost="180/Kg";
		System.out.println(app.type  + app.cost);
		app.expressIt();
		app.explore();
	}

}
