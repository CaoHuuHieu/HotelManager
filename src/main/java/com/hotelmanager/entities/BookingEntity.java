package com.hotelmanager.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Booking")
public class BookingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "staff_id", referencedColumnName = "id")
	private UserEntity staff;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id", referencedColumnName = "id")
	private UserEntity custommer;
	private Date checkin;
	private Date checkout;
	private int status;
	private Date bookingAt;
	
	public Date getBookingAt() {
		return bookingAt;
	}

	public void setBookingAt(Date bookingAt) {
		this.bookingAt = bookingAt;
	}

	public UserEntity getStaff() {
		return staff;
	}

	public BookingEntity() {
		super();
	}

	public BookingEntity( UserEntity staff, UserEntity custommer, Date localDate, Date localDate2, Date bookingAt, int status) {
		super();
		this.staff = staff;
		this.custommer = custommer;
		this.checkin = localDate;
		this.checkout = localDate2;
		this.status = status;
		this.bookingAt = bookingAt;
	}

	public void setStaff(UserEntity staff) {
		this.staff = staff;
	}

	public UserEntity getCustommer() {
		return custommer;
	}

	public void setCustommer(UserEntity custommer) {
		this.custommer = custommer;
	}
	@OneToMany(mappedBy = "bookingdetail")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCheckin() {
		return checkin;
	}

	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
