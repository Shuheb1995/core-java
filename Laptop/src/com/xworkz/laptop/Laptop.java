package com.xworkz.laptop;

public abstract class Laptop {
	
	//----Abstract Methods-------
	public abstract void typing();
	public abstract void playVideos();
	public abstract void internet();
	public abstract void storage();
	public abstract void externalConnector();
	
	//-----Concrete Methods------
	public void portable() {
		System.out.println("Laptop can take one place to another easily");
	}
	
	public void charging() {
		System.out.println("Laptop is Chargable");
	}
	public void mouse() {
		System.out.println("Laptop Has a Mouse");
	}

}
