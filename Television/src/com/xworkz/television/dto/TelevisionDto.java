package com.xworkz.television.dto;

public class TelevisionDto {
	
	private Character brand;
	private Integer price;
	private Boolean graphics;
	private Boolean streaming;
	
	
	public TelevisionDto(Character brand, Integer price, Boolean graphics, Boolean streaming) {
		super();
		this.brand = brand;
		this.price = price;
		this.graphics = graphics;
		this.streaming = streaming;
	}
	public Character getBrand() {
		return brand;
	}
	public void setBrand(Character brand) {
		this.brand = brand;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Boolean getGraphics() {
		return graphics;
	}
	public void setGraphics(Boolean graphics) {
		this.graphics = graphics;
	}
	public Boolean getStreaming() {
		return streaming;
	}
	public void setStreaming(Boolean streaming) {
		this.streaming = streaming;
	}
	@Override
	public String toString() {
		return "TelevisionDto [brand=" + brand + ", price=" + price + ", graphics=" + graphics + ", streaming="
				+ streaming + "]";
	}
	
	

}
