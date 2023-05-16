package com.xworkz.laptop;

public class LaptopRunner {
	
	public static void main(String[] args) {
		
		Dell lap = new Dell();
		HP lap1 = new HP();
		Lenovo lap2 = new Lenovo();
		
		lap.typing();
		lap.playVideos();
		lap.storage();
		lap.externalConnector();
		lap.internet();
		lap1.playVideos();
		lap1.typing();
		lap1.storage();
		lap1.externalConnector();
		lap1.internet();
		lap2.playVideos();
		lap2.externalConnector();
		lap2.typing();
		lap2.internet();
		lap2.storage();
		System.out.println("-------------------------------------------------------------------------");
		lap.charging();
		lap1.portable();
		lap2.mouse();
		
	}
	

}
