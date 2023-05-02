package com.xworkz.resume.dto;

public class ResumeDto {  
	
	String name;
	String email;
	long phoneNumber;
	String dateOfbirth;
	String degree;
	String fatherName;
	AddressDto address;
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDateOfbirth() {
		return dateOfbirth;
	}

	public void setDateOfbirth(String dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "ResumeDto [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", dateOfbirth="
				+ dateOfbirth + ", degree=" + degree + ", fatherName=" + fatherName + ", address=" + address + "]";
	


	}
	
	

	public ResumeDto(String name, String email, long phoneNumber, String dateOfbirth, String degree, String fatherName,
			AddressDto address) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dateOfbirth = dateOfbirth;
		this.degree = degree;
		this.fatherName = fatherName;
		this.address=address;
	}
	

}
