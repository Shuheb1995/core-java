package com.xworkz.headset.dto;

public class HeadSetDto {
	
	private String brand;
	private String type;
	private int price;
	private float ratings;
	private boolean charger;
	
	public HeadSetDto(String brand, String type, int price, float ratings, boolean charger) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.ratings = ratings;
		this.charger = charger;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public boolean isCharger() {
		return charger;
	}

	public void setCharger(boolean charger) {
		this.charger = charger;
	}

	@Override
	public String toString() {
		return "HeadSetDto [brand=" + brand + ", type=" + type + ", price=" + price + ", ratings=" + ratings
				+ ", charger=" + charger + "]";
	}
	
	
	
	

}
