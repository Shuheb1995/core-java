package com.xworkz.pizza.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.xml.transform.Source;

public class PizzaDto {
	
	@NotBlank
	@NotEmpty
	@Size(min=3,max=30)
	private String pizzaName;
	@NotBlank
	@NotEmpty
	private String type;
	@NotBlank
	@NotEmpty
	private String size;
	@NotBlank
	@NotEmpty
	private String location;
	@NotBlank
	@NotEmpty
	private String paymentMode;
	
	public PizzaDto(String pizzaName, String type, String size, String location, String paymentMode) {
		super();
		this.pizzaName = pizzaName;
		this.type = type;
		this.size = size;
		this.location = location;
		this.paymentMode = paymentMode;
	}
	
	public PizzaDto() {
		
	}

	public String getPizzaName() {
		return pizzaName;
	}
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
	@Override
	public String toString() {
		return "PizzaDto [pizzaName=" + pizzaName + ", type=" + type + ", size=" + size + ", location=" + location
				+ ", paymentMode=" + paymentMode + "]";
	}
	
	

}
