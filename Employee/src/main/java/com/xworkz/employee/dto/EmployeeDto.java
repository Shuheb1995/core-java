package com.xworkz.employee.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "Employee_table")
@Entity
@NamedQuery(name = "find" , query = "Select dto from EmployeeDto dto where dto.name=:nm")
@NamedQuery(name = "update" , query = "update EmployeeDto dto set dto.mobileNumber=:mn where dto.name=:nm")
@NamedQuery(name = "delete" , query = "delete from EmployeeDto dto where dto.name=:nm")
@NamedQuery(name = "read" , query = "Select dto from EmployeeDto dto")
public class EmployeeDto {
	
	@Id
	private int id;
	private String name;
	private int age;
	private long mobileNumber;
	private String qualification;
	private String gender;
	private String designation;
	private int salary;
	private String address;
	private String joiningDate;
	
	public EmployeeDto() {
		super();
	}
	
	public EmployeeDto(int id, String name, int age, long mobileNumber, String qualification, String gender,
			String designation, int salary, String address, String joiningDate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.qualification = qualification;
		this.gender = gender;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
		this.joiningDate = joiningDate;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", name=" + name + ", age=" + age + ", mobileNumber=" + mobileNumber
				+ ", qualification=" + qualification + ", gender=" + gender + ", designation=" + designation
				+ ", salary=" + salary + ", address=" + address + ", joiningDate=" + joiningDate + "]";
	}
	
	
	

}
