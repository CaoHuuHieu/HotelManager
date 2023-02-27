package com.hotelmanager.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Room")
public class RoomEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String room_no;
	private String room_name;
	private int id_roomtype;
	private int num_people;
	private float price;
	private int status;
	
	public RoomEntity() {
		
	}
	
	public RoomEntity(int id) {
		this.id = id;
	}
	
	public RoomEntity( String room_no, String room_name, int id_roomtype, int num_people, float price) {
		
		this.room_no = room_no;
		this.room_name = room_name;
		this.id_roomtype = id_roomtype;
		this.num_people = num_people;
		this.price = price;
		this.status = 0;
	}
	public RoomEntity(int id, String room_no, String room_name, int id_roomtype, int num_people, float price,
			int status) {
		
		this.id = id;
		this.room_no = room_no;
		this.room_name = room_name;
		this.id_roomtype = id_roomtype;
		this.num_people = num_people;
		this.price = price;
		this.status = status;
	}
	
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
	
	public int getId_roomtype() {
		return id_roomtype;
	}
	public void setId_roomtype(int id_roomtype) {
		this.id_roomtype = id_roomtype;
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

}
