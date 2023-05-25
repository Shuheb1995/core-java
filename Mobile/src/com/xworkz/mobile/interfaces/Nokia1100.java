package com.xworkz.mobile.interfaces;

public class Nokia1100 implements Mobile {
	
	
	

	@Override
	public void call(String call) {
		if(call!=null) {
			for(int i=0;i<array.length;i++) {
				if(array[i]==null) {
					array[i]=call;
					System.out.println("Call Method is Implemented");
					return;
				}
			}
			return;
		}
		return;
		
	}
	public void message(String msg) {
		if(msg!=null) {
			for(int i=0;i<array.length;i++) {
				if(array[i]==null) {
					array[i]=msg;
					System.out.println("Message Method is Implemented");
					return;
				}
			}
			return;
		}
		return;
		
	}
	
	

}
