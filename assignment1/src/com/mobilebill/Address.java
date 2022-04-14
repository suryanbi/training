package com.mobilebill;

public class Address {
	private int doorNumber;
	private String streetName;
	private int pinCode;
	private String areaName;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int doorNumber, String streetName, int pinCode, String areaName) {
		super();
		this.doorNumber = doorNumber;
		this.streetName = streetName;
		this.pinCode = pinCode;
		this.areaName = areaName;
	}
	@Override
	public String toString() {
		return "Address [doorNumber=" + doorNumber + ", streetName=" + streetName + ", pinCode=" + pinCode
				+ ", areaName=" + areaName + "]";
	}
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	
	

}
