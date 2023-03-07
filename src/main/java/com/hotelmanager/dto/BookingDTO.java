package com.hotelmanager.dto;

import java.sql.Date;
import java.time.LocalDate;

public class BookingDTO {
	private int idRoom;
	private String cccd;
	private String fullName;
	private String phone_number;
	private Date birthDay;
	private String email;
	private String address;
	private Date checkIn;
	private Date checkOut;
	private String ghiChu;
	
	public BookingDTO(int idRoom, String cccd, String fullName, String phone_number, Date birthDay, String email,
			String address, Date checkIn, Date checkOut, String ghiChu) {
		super();
		this.idRoom = idRoom;
		this.cccd = cccd;
		this.fullName = fullName;
		this.phone_number = phone_number;
		this.birthDay = birthDay;
		this.email = email;
		this.address = address;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.ghiChu = ghiChu;
	}
	public BookingDTO() {
		super();
	}
	@Override
	public String toString() {
		return "BookingDTO [idRoom=" + idRoom + ", cccd=" + cccd + ", fullName=" + fullName + ", phone_number="
				+ phone_number + ", birthDay=" + birthDay + ", email=" + email + ", address=" + address + ", checkIn="
				+ checkIn + ", checkOut=" + checkOut + ", ghiChu=" + ghiChu + "]";
	}
	public int getIdRoom() {
		return idRoom;
	}
	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}
	public String getCccd() {
		return cccd;
	}
	public void setCccd(String cccd) {
		this.cccd = cccd;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
}
