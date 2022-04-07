package com.hotel;

public class Hotel {
	
	private String hotelName;
	private int roomNumber;
	private String place;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(String hotelName, int roomNumber, String place) {
		super();
		this.hotelName = hotelName;
		this.roomNumber = roomNumber;
		this.place = place;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	

}
