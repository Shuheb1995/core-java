package com.xworkz.metro.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class MetroDto {

	private String id;
	@NotBlank
	@NotEmpty
	private String name;
	@NotBlank
	@NotEmpty
	private String city;
	@NotBlank
	@NotEmpty
	private String state;
	@NotBlank
	@NotEmpty
	private String pincode;
	@NotBlank
	@NotEmpty
	private String birthDate;
	@NotBlank
	@NotEmpty
	private String gender;
	@NotBlank
	@NotEmpty
	private String maritalStatus;
	@NotBlank
	@NotEmpty
	private String mobileNumber;
	@NotBlank
	@NotEmpty
	private String period;
	@NotBlank
	@NotEmpty
	private String fare;

	public MetroDto() {

	}

	public MetroDto(String id, String name, String city, String state, String pincode, String birthDate, String gender,
			String maritalStatus, String mobileNumber, String period, String fare) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.birthDate = birthDate;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.mobileNumber = mobileNumber;
		this.period = period;
		this.fare = fare;
	}

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}



}
