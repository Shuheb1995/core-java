package com.xworkz.mobile;


import com.xworkz.mobile.interfaces.Iphone;
import com.xworkz.mobile.interfaces.Nokia1100;
import com.xworkz.mobile.interfaces.OnePlus;

public class MobileRunner {
	
	public static void main(String[] args) {
		
		Nokia1100 ref = new Nokia1100();
		ref.call("Call");
		ref.message("Message");
		System.out.println("--------------------------------------------------");
		OnePlus ref1=new OnePlus();
		ref1.call("VoLte");
		ref1.message("message");
		ref1.camera("Rear and Front Camera");
		ref1.internet("JioNet");
		System.out.println("--------------------------------------------------");
		Iphone ref2=new Iphone();
		ref2.call(null);
		ref2.message(null);
		ref2.camera(null);
		ref2.internet(null);
		
	}
	
	
	
	
	

}
