package com.xworkz.payingguest.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "PG_table")
@Entity

public class PayingGuestDto {
	
	@Id
	private int id;
	private String pgName;
	private String location;
	private int rent;
	private String facility;
	private boolean wifi;
	private String timings;
	private String food;
	
	public PayingGuestDto() {
		super();
	}
	
	public PayingGuestDto(int id, String pgName, String location, int rent, String facility, boolean wifi,
			String timings, String food) {
		super();
		this.id = id;
		this.pgName = pgName;
		this.location = location;
		this.rent = rent;
		this.facility = facility;
		this.wifi = wifi;
		this.timings = timings;
		this.food = food;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPgName() {
		return pgName;
	}

	public void setPgName(String pgName) {
		this.pgName = pgName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return "PayingGuestDto [id=" + id + ", pgName=" + pgName + ", location=" + location + ", rent=" + rent
				+ ", facility=" + facility + ", wifi=" + wifi + ", timings=" + timings + ", food=" + food + "]";
	}
	
	
	
	

}
