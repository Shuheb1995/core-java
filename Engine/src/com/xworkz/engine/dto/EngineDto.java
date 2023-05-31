package com.xworkz.engine.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class EngineDto {

	private String name;
	private String type;
	private String fuel;
	private int price;
	private String cycle;
	private String layout;
	

	public EngineDto(String name, String type, String fuel, int price, String cycle, String layout) {
		super();
		this.name = name;
		this.type = type;
		this.fuel = fuel;
		this.price = price;
		this.cycle = cycle;
		this.layout = layout;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCycle() {
		return cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public String getLayout() {
		return layout;
	}

	public void setLayout(String layout) {
		this.layout = layout;
	}

	@Override
	public String toString() {
		return "EngineDto [name=" + name + ", type=" + type + ", fuel=" + fuel + ", price=" + price + ", cycle=" + cycle
				+ ", layout=" + layout + "]";
	}

}
