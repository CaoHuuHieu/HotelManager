package com.hotelmanager.entities;

public class RoomDto {
	private int id;
	private String room_no;
	private String room_name;
	private int num_people;
	private float price;
	private String name_type;
	private int status;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RoomDto(int id, String room_no, int num_people, float price, int status) {
		super();
		this.id = id;
		this.room_no = room_no;
		this.num_people = num_people;
		this.price = price;
		this.status = status;
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

	public String getName_type() {
		return name_type;
	}

	public void setName_type(String name_type) {
		this.name_type = name_type;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public RoomDto(int id, String room_no, String room_name, int id_roomtype, int num_people, float price,
			String name_type, int status) {
		super();
		this.id = id;
		this.room_no = room_no;
		this.room_name = room_name;
		this.num_people = num_people;
		this.price = price;
		this.name_type = name_type;
		this.status = status;
	}
	
}
