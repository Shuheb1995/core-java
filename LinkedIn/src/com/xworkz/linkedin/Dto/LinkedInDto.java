package com.xworkz.linkedin.Dto;

import java.sql.Date;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString


public class LinkedInDto {
	
	private int id;
	private String name;
	private String qualification;
	private String email;
	private String experience;
	private String skills;
	private Date dateOfBirth;
	
	
	public LinkedInDto(int id, String name, String qualification, String email, String experience, String skills,
			Date dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.email = email;
		this.experience = experience;
		this.skills = skills;
		this.dateOfBirth = dateOfBirth;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getExperience() {
		return experience;
	}


	public void setExperience(String experience) {
		this.experience = experience;
	}


	public String getSkills() {
		return skills;
	}


	public void setSkills(String skills) {
		this.skills = skills;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	@Override
	public String toString() {
		return "LinkedInDto [id=" + id + ", name=" + name + ", qualification=" + qualification + ", email=" + email
				+ ", experience=" + experience + ", skills=" + skills + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	
	
	
	

}
