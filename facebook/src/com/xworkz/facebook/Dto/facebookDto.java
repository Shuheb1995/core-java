package com.xworkz.facebook.Dto;

import java.sql.Date;

public class facebookDto {
	
	private int id;
	private String firstName;
	
	private String lastName;
	private Date DOB;
	private String email;
	private int phoneNumber;
	private String gender;
	private String password;
	
	
	public facebookDto(int id, String firstName, String lastName, Date dOB, String email, int phoneNumber, String gender,
			String password) {
		super();
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		DOB = dOB;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.password = password;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getDOB() {
		return DOB;
	}


	public void setDOB(Date dOB) {
		DOB = dOB;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "facebookDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", DOB=" + DOB
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", gender=" + gender + ", password=" + password
				+ "]";
	}


	
	
	
	

}
