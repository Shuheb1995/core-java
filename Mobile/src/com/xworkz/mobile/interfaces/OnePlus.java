package com.xworkz.mobile.interfaces;

public class OnePlus implements Mobile, Smartphone {

	public void call(String updateCall) {
		if (updateCall != null) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] != null) {
					array[i]=updateCall;
					System.out.println("Calling option is updated to VoLte");
					return;
				}
			}
			return;
		}
		return;
	}
	
	public void message(String msg) {
		System.out.println("Message method is implemented");
		
	}
	public void camera(String cam) {
		if(cam!=null) {
			for(int i=0;i<array.length;i++) {
				if(array[i]==null) {
					array[i]=cam;
					System.out.println("Camera Method is Implemented");
					return;
				}
			}
			return;
		}
		return;
		
		
	}
	
	public void internet(String net) {
		if(net!=null) {
			for(int i=0;i<array.length;i++) {
				if(array[i]==null) {
					array[i]=net;
					System.out.println("Internet Method is Implemented");
					return;
				}
			}
			return;
		}
		return;
		
	}

}
