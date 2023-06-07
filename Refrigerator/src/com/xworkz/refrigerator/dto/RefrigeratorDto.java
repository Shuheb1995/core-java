package com.xworkz.refrigerator.dto;

public class RefrigeratorDto {
	
	private String brand;
	private String color;
	private int price;
	private String type;
	private int capacity;
	
	public RefrigeratorDto(String brand, String color, int price, String type, int capacity) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.type = type;
		this.capacity = capacity;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "RefrigeratorDto [brand=" + brand + ", color=" + color + ", price=" + price + ", type=" + type
				+ ", capacity=" + capacity + "]";
	}
	
	

}
