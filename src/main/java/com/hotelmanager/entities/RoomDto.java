package com.hotelmanager.entities;

import java.util.Set;

public class RoomDTO {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoom_no() {
		return room_no;
	}
	public void setRoom_no(String room_no) {
		this.room_no = room_no;
	}
	public String getRoom_name() {
		return room_name;
	}
	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}
	public RoomTypeEntity getRoomTypeEntity() {
		return roomTypeEntity;
	}
	public void setRoomTypeEntity(RoomTypeEntity roomTypeEntity) {
		this.roomTypeEntity = roomTypeEntity;
	}
	public int getNum_people() {
		return num_people;
	}
	public void setNum_people(int num_people) {
		this.num_people = num_people;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public ImageEntity getImageEntities() {
		return imageEntities;
	}
	public void setImageEntities(ImageEntity imageEntities) {
		this.imageEntities = imageEntities;
	}
	private int id;
	private String room_no;
	private String room_name;
	private RoomTypeEntity roomTypeEntity;
	private int num_people;
	private float price;
	private int status;
	ImageEntity imageEntities;
}
