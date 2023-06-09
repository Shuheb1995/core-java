package com.xworkz.student.dto;

public class StudentDto implements Comparable<StudentDto>{

	private String name;
	private int registerNumber;
	private int age;
	private String qualification;
	private String place;

	public StudentDto(String name, int registerNumber, int age, String qualification, String place) {
		super();
		this.name = name;
		this.registerNumber = registerNumber;
		this.age = age;
		this.qualification = qualification;
		this.place = place;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(int registerNumber) {
		this.registerNumber = registerNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "StudentDto [name=" + name + ", registerNumber=" + registerNumber + ", age=" + age + ", qualification="
				+ qualification + ", place=" + place + "]";
	}

	@Override
	public int compareTo(StudentDto o) {
		if(age>o.getAge()) {
			return 1;
		}else {
			return -1;
		}
	}

}
