package com.xworkz.taxi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "Taxi_Info")
@Entity
@NamedQuery(name = "readAll" , query = "Select dto from TaxiDto dto")
@NamedQuery(name = "updateTaxiEarnings" , query = "update TaxiDto dto set dto.earnings=:ern where dto.taxiNumber=:tn")
@NamedQuery(name = "updateTaxiAvailableById" , query = "update TaxiDto dto set dto.isAvailable=:ia where dto.id=:id")
@NamedQuery(name = "find" , query = "Select dto from TaxiDto dto where dto.location=:lcn")
@NamedQuery(name = "findAllAvailableTaxis" , query = "Select dto from TaxiDto dto where dto.isAvailable=:ia")
@NamedQuery(name = "bookTaxi" , query = "Select dto from TaxiDto dto")
public class TaxiDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String taxiNumber;
	private String earnings;
	private boolean isAvailable;
	private String location;
	private String trips;
	
	public TaxiDto() {
		super();
	}
	
//	static {
//		isAvailable = true;
//	}

	public TaxiDto(String taxiNumber, String earnings , boolean isAvailable , String location, String trips) {
		super();
		this.taxiNumber = taxiNumber;
		this.earnings = earnings;
		this.isAvailable =  isAvailable;
		this.location = location;
		this.trips = trips;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTaxiNumber() {
		return taxiNumber;
	}

	public void setTaxiNumber(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}

	public String getEarnings() {
		return earnings;
	}

	public void setEarnings(String earnings) {
		this.earnings = earnings;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTrips() {
		return trips;
	}

	public void setTrips(String trips) {
		this.trips = trips;
	}

	@Override
	public String toString() {
		return "TaxiDto [id=" + id + ", taxiNumber=" + taxiNumber + ", earnings=" + earnings + ", isAvailable="
				+ isAvailable + ", location=" + location + ", trips=" + trips + "]";
	}
	
	
	
	

}
