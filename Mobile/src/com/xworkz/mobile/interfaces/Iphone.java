package com.xworkz.mobile.interfaces;

public class Iphone implements Mobile,Smartphone {

	public void camera(String cam) {
		System.out.println("Camera clearity is Upgraded");
		
	}

	public void internet(String net) {
		System.out.println("Internet upgraded to higher speed");
		
	}

	public void call(String call) {
		System.out.println("Calling upgraded to HD quality");
		
	}

	public void message(String msg) {
		System.out.println("Messaging can be done with advanced options");
		
	}

}
