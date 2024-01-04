package com.xworkz.twitter.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name  = "Twitter_Table")
@Entity


public class TwitterDto {
	@Id
	private int id;
	private String userName;
	private String email;
	private String accountType;
	private String password;
	
	public TwitterDto(){
		
	}
	
	public TwitterDto(int id, String userName, String email, String accountType, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.accountType = accountType;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "TwitterDto [id=" + id + ", userName=" + userName + ", email=" + email + ", accountType=" + accountType
				+ ", password=" + password + "]";
	}
	
	
	

}
