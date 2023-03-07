package com.hotelmanager.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Users")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String password;
	private String fullname;
	private Date birthday;
	private Date createday;
	private String gender;
	private String phone_number;
	private String address;
	private String email;
	private String cccd;


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="role_id", referencedColumnName = "id")
	private RoleEntity role;
	private int status;
	@OneToOne (mappedBy = "Booking")
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getCreateday() {
		return createday;
	}

	public void setCreateday(Date createday) {
		this.createday = createday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public RoleEntity getRole() {
		return role;
	}

	public void setRole(RoleEntity role) {
		this.role = role;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", username=" + username + ", password=" + password + ", fullname=" + fullname
				+ ", birthday=" + birthday + ", createday=" + createday + ", gender=" + gender + ", phone_number="
				+ phone_number + ", address=" + address + ", role=" + role + ", status=" + status + "]";
	}
	
	public UserEntity(String fullname, Date birthday, String phone_number, String address, String email, String cccd
			) {
		super();
		this.fullname = fullname;
		this.birthday = birthday;
		this.phone_number = phone_number;
		this.address = address;
		this.email = email;
		this.cccd = cccd;
	}

	public String getCccd() {
		return cccd;
	}
	public UserEntity() {
		super();
	}
	public void setCccd(String cccd) {
		this.cccd = cccd;
	}
}
