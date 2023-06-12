package com.xworkz.electronics;

public class ElectronicsDto  {
	
	private String name;
	private String brand;
	private int price;
	private int dateOfManufactured;
	private int warranty;
	
	public ElectronicsDto(String name, String brand, int price, int dateOfManufactured, int warranty) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.dateOfManufactured = dateOfManufactured;
		this.warranty = warranty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getDateOfManufactured() {
		return dateOfManufactured;
	}

	public void setDateOfManufactured(int dateOfManufactured) {
		this.dateOfManufactured = dateOfManufactured;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "ElectronicsDto [name=" + name + ", brand=" + brand + ", price=" + price + ", dateOfManufactured="
				+ dateOfManufactured + ", warranty=" + warranty + "]";
	}

	
	
	
	

}
