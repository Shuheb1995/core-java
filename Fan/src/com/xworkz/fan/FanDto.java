package com.xworkz.fan;

public class FanDto implements Comparable {
	
	private String brand;
	private int price;
	
	public FanDto(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "FanDto [brand=" + brand + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Object o) {
		if(price > o.price) {
			
		}
	}

	
	
	

}
