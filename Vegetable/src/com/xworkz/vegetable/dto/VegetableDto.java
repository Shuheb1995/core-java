package com.xworkz.vegetable.dto;

import com.xworkz.vegetable.constant.Type;

public class VegetableDto {
	
	private String name;
	private String color;
	private int price;
	private Type type;
	private Vitamins vitamine;
	
	
	public VegetableDto(String name, String color, int price, Type type, Vitamins vitamine) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.type = type;
		this.vitamine = vitamine;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Vitamins getVitamine() {
		return vitamine;
	}
	public void setVitamine(Vitamins vitamine) {
		this.vitamine = vitamine;
	}

	public String toString() {
		return "VegetableDto [name=" + name + ", color=" + color + ", price=" + price + ", type=" + type + ", vitamine="
				+ vitamine + "]";
	}
	
	

}
