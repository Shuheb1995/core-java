package com.xworkz.customatm.dto;

public class AtmDto {
	
	private String bankName;
	private String location;
	private String cardtype;
	private int maxWithdraw;
	private String serviceAvailable;
	
	public AtmDto(String bankName, String location, String cardtype, int maxWithdraw, String serviceAvailable) {
		super();
		this.bankName = bankName;
		this.location = location;
		this.cardtype = cardtype;
		this.maxWithdraw = maxWithdraw;
		this.serviceAvailable = serviceAvailable;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCardtype() {
		return cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

	public int getMaxWithdraw() {
		return maxWithdraw;
	}

	public void setMaxWithdraw(int maxWithdraw) {
		this.maxWithdraw = maxWithdraw;
	}

	public String getServiceAvailable() {
		return serviceAvailable;
	}

	public void setServiceAvailable(String serviceAvailable) {
		this.serviceAvailable = serviceAvailable;
	}

	@Override
	public String toString() {
		return "AtmDto [bankName=" + bankName + ", location=" + location + ", cardtype=" + cardtype + ", maxWithdraw="
				+ maxWithdraw + ", serviceAvailable=" + serviceAvailable + "]";
	}
	
	
	

}
