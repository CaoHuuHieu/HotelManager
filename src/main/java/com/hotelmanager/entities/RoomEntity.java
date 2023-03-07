package com.hotelmanager.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="room")
public class RoomEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String room_no;
	private String room_name;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_roomtype", referencedColumnName = "id")
	private RoomTypeEntity roomTypeEntity;
	
	 @ManyToMany
	 @JoinTable(
			  name = "ImageRoom", 
			  joinColumns = @JoinColumn(name = "id_room"), 
			  inverseJoinColumns = @JoinColumn(name = "id_pic"))
     Set<ImageEntity> imageEntities;
	 
	 public Set<ImageEntity> getImageEntities() {
		return imageEntities;
	}
	public void setImageEntities(Set<ImageEntity> imageEntities) {
		this.imageEntities = imageEntities;
	}
	
	@OneToMany(mappedBy = "bookingdetail")
	 
	 
	public RoomTypeEntity getRoomTypeEntity() {
		return roomTypeEntity;
	}
	public void setRoomTypeEntity(RoomTypeEntity roomTypeEntity) {
		this.roomTypeEntity = roomTypeEntity;
	}
	private int num_people;
	private int price;
	private int status;
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
	
	public int getNum_people() {
		return num_people;
	}
	public void setNum_people(int num_people) {
		this.num_people = num_people;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
