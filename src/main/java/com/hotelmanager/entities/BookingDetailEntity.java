package com.hotelmanager.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bookingdetail")
public class BookingDetailEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="booking_id", referencedColumnName = "id")
	private BookingEntity bookingEntity;
	@ManyToOne
	@JoinColumn(name="room_id", referencedColumnName = "id")
	private RoomEntity roomEntity;
	private int price;
	
	public BookingDetailEntity() {
		super();
	}
	
	public BookingDetailEntity( BookingEntity bookingEntity, RoomEntity roomEntity, int price) {
		super();
		this.bookingEntity = bookingEntity;
		this.roomEntity = roomEntity;
		this.price = price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public BookingEntity getBookingEntity() {
		return bookingEntity;
	}
	public void setBookingEntity(BookingEntity bookingEntity) {
		this.bookingEntity = bookingEntity;
	}
	public RoomEntity getRoomEntity() {
		return roomEntity;
	}
	public void setRoomEntity(RoomEntity roomEntity) {
		this.roomEntity = roomEntity;
	}
	@Override
	public String toString() {
		return "BookingDetailEntity [id=" + id + ", bookingEntity=" + bookingEntity + ", roomEntity=" + roomEntity
				+ ", price=" + price + "]";
	}
	
}
